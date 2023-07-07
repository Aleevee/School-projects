import java.util.Scanner;

public class chessBoard {
    private static final int BOARD_SIZE = 8;
    private static final char[] FILES = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    private static final char[] RANKS = {'1', '2', '3', '4', '5', '6', '7', '8'};
    private static final String[][] board = new String[BOARD_SIZE][BOARD_SIZE];

    private static final String BOT_PIECE = "♖♘♗♔♕♙";
    private static final String PLAYER_PIECE = "♜♞♝♛♚♟";

    private static int parseFile(char file) {
        for (int i = 0; i < FILES.length; i++) {
            if (FILES[i] == file) {
                return i;
            }
        }
        return -1;
    }

    private static int parseRank(char rank) {
        for (int i = 0; i < RANKS.length; i++) {
            if (RANKS[i] == rank) {
                return i;
            }
        }
        return -1;
    }

    private static void initializeBoard() {

        board[0] = new String[]{"♜", "♞", "♝", "♚", "♛", "♝", "♞", "♜"};
        board[1] = new String[]{"♟", "♟", "♟", "♟", "♟", "♟", "♟", "♟"};
        for (int rank = 2; rank < 6; rank++) {
            for (int file = 0; file < BOARD_SIZE; file++) {
                board[rank][file] = "-";
            }
        }
        board[6] = new String[]{"♙", "♙", "♙", "♙", "♙", "♙", "♙", "♙"};
        board[7] = new String[]{"♖", "♘", "♗", "♔", "♕", "♗", "♘", "♖"};
    }

    private static void printBoard() {
        System.out.println("   a  b  c  d  e  f  g  h");
        for (int rank = BOARD_SIZE - 1; rank >= 0; rank--) {
            System.out.print(RANKS[rank] + " ");
            for (int file = 0; file < BOARD_SIZE; file++) {
                System.out.print("|" + board[rank][file] + "|");
            }
            System.out.println();
        }
    }
    private static boolean isValidMove(int srcRank, int srcFile, int destRank, int destFile, String piece) {

        if (piece.equals("♟")) {

            return srcFile == destFile && Math.abs(destRank - srcRank) <= 2;
        }
        return false;
    }
    private static boolean isPieceCaptured(int destRank, int destFile) {
        String piece = board[destRank][destFile];
        if (BOT_PIECE.contains(piece)) {
            System.out.println("Bot captured your piece!");
            return true;
        } else if (PLAYER_PIECE.contains(piece)) {
            System.out.println("You captured a piece!");
            return true;
        }
        return false;
    }

    private static boolean isKingCaptured(String piece) {
        return piece.equals("♚") || piece.equals("♔");
    }

    private static void movePiece(String move, boolean isPlayerTurn) {

        char srcFile = move.charAt(0);
        char srcRank = move.charAt(1);
        char destFile = move.charAt(2);
        char destRank = move.charAt(3);

        int srcFileIndex = parseFile(srcFile);
        int srcRankIndex = parseRank(srcRank);
        int destFileIndex = parseFile(destFile);
        int destRankIndex = parseRank(destRank);

        String piece = board[srcRankIndex][srcFileIndex];
        if (isValidMove(srcRankIndex, srcFileIndex, destRankIndex, destFileIndex, piece)) {

            board[destRankIndex][destFileIndex] = piece;
            board[srcRankIndex][srcFileIndex] = "-";
        } else {
            System.out.println("Invalid move!");
            return;
        }

        if (isKingCaptured(piece)) {
            if (isPlayerTurn) {
                System.out.println("Bot wins! Your king is captured.");
            } else {
                System.out.println("You win! Bot's king is captured.");
            }
            return;
        }
        printBoard();

        if (isGameover()) {
            return;
        }

        if (isPlayerTurn) {

            botMove();
        } else {

            getPlayerMove();
        }
    }

    private static void botMove() {

        int srcRank, srcFile;
        String piece;
        do {
            srcRank = (int) (Math.random() * BOARD_SIZE);
            srcFile = (int) (Math.random() * BOARD_SIZE);
            piece = board[srcRank][srcFile];
        } while (!BOT_PIECE.contains(piece));

        // Find a random destination
        int destRank, destFile;
        do {
            destRank = (int) (Math.random() * BOARD_SIZE);
            destFile = (int) (Math.random() * BOARD_SIZE);
        } while (!isValidMove(srcRank, srcFile, destRank, destFile, piece));


        System.out.println("Bot moves " + piece + " from " + FILES[srcFile] + RANKS[srcRank] + " to " + FILES[destFile] + RANKS[destRank]);
        movePiece(FILES[srcFile] + "" + RANKS[srcRank] + "" + FILES[destFile] + "" + RANKS[destRank], false);
    }
    private static boolean isGameover() {
        System.out.println("Game in progress...");
        return false;
    }

    private static void getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your move (e.g., a2a4): ");
        String move = scanner.nextLine();

        movePiece(move, true);
    }

    public static void main(String[] args) {
        initializeBoard();
        printBoard();

        getPlayerMove();
    }
}

//    a  b  c  d  e  f  g  h
//8 |♖||♘||♗||♔||♕||♗||♘||♖|
//7 |♙||♙||♙||♙||♙||♙||♙||♙|
//6 |-||-||-||-||-||-||-||-|
//5 |-||-||-||-||-||-||-||-|
//4 |-||-||-||-||-||-||-||-|
//3 |-||-||-||-||-||-||-||-|
//2 |♟||♟||♟||♟||♟||♟||♟||♟|
//1 |♜||♞||♝||♚||♛||♝||♞||♜|
//Enter your move (e.g., a2a4): 

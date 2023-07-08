import java.util.*;

public class chessBoard{
    public static void printBoard() {

        String boardTop = "    a   b   c  d   e  f   g  h";
        String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
        String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
        String blankLine = " |-||-||-||-||-||-||-||-|";
        String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
        String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

        System.out.println(boardTop);
        System.out.println(botBoard8);
        System.out.println(botBoard7);
        System.out.println("6" + blankLine);
        System.out.println("5" + blankLine);
        System.out.println("4" + blankLine);
        System.out.println("3" + blankLine);
        System.out.println(playerBoard2);
        System.out.println(playerBoard1);
    }

        public static void firstPlayerMove() {
            String boardTop = "    a   b   c  d   e  f   g  h";
            String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
            String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
            String blankLine = " |-||-||-||-||-||-||-||-|";
            String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
            String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

            System.out.println(boardTop);
            System.out.println(botBoard8);
            System.out.println(botBoard7);
            System.out.println("6" + blankLine);
            System.out.println("5" + blankLine);
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

    public static void main(String[] args) {
        String boardTop = "    a   b  c   d  e   f   g  h";
        String botBoard8 = "8 |♖||♘||♗||♔||♕||♗||♘||♖|";
        String botBoard7 = "7 |♙||♙||♙||♙||♙||♙||♙||♙|";
        String blankLine = " |-||-||-||-||-||-||-||-|";
        String playerBoard2 = "2 |♟||♟||♟||♟||♟||♟||♟||♟|";
        String playerBoard1 = "1 |♜||♞||♝||♚||♛||♝||♞||♜|";

        String a2a_ = " |♟||-||-||-||-||-||-||-|";
        String a2a = " |-||♟||♟||♟||♟||♟||♟||♟|";

        String b2b_ = " |-||♟||-||-||-||-||-||-|";
        String b2b = " |♟||-||♟||♟||♟||♟||♟||♟|";

        String c2c_ = " |-||-||♟||-||-||-||-||-|";
        String c2c = " |♟||♟||-||♟||♟||♟||♟||♟|";

        printBoard();

        System.out.println("Enter your move (e.g., a2a4): ");

        Scanner scanner = new Scanner(System.in);
            String firstUserMove = scanner.nextLine();

            switch(firstUserMove) {
                case "A2A3", "a2a3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + a2a_);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                case "A2A4", "a2a4" -> {
                    firstPlayerMove();
                    System.out.println("4" + a2a_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + a2a);
                    System.out.println(playerBoard1);
                }
                case "b2b3", "B2B3" -> {
                    firstPlayerMove();
                    System.out.println("3" + blankLine);
                    System.out.println("3" + b2b_);
                    System.out.println("2" + b2b);
                    System.out.println(playerBoard1);
                }
                case "b2b4", "B2B4" -> {
                    firstPlayerMove();
                    System.out.println("4" + b2b_);
                    System.out.println("3" + blankLine);
                    System.out.println("2" + b2b);
                    System.out.println(playerBoard1);
                }
                case "c2c3", "C2C3" -> {
                    firstPlayerMove();
                    System.out.println("4" + blankLine);
                    System.out.println("3" + c2c_);
                    System.out.println("2" + c2c);
                    System.out.println(playerBoard1);
                }



            }
    }
}

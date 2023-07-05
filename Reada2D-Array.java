import java.util.Scanner;

public class MatrixDisplay {
    public static void main(String[] args) {
        displayMatrix();
    }

    public static void displayMatrix() {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();  // Read the number of rows
        int cols = scanner.nextInt();  // Read the number of columns

        int[][] matrix = new int[rows][cols];  // Initialize the matrix

        // Read the array elements and populate the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Display the matrix in matrix form
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);

                // Print a space after each number except for the last number in the row
                if (j < cols - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        readArray();
    }

    public static void readArray() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // Read the size of the array
        int[] A = new int[N];  // Declare the array with size N

        // Read the array elements
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Print the array elements
        for (int i = 0; i < N; i++) {
            System.out.print(A[i]);

            // Print a space after each number except for the last number
            if (i < N - 1) {
                System.out.print(" ");
            }
        }

        scanner.close();
    }
}

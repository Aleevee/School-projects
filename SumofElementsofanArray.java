import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        findSum();
    }

    public static void findSum() {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // Read the size of the array
        long[] array = new long[N];  // Declare the array with size N

        // Read the array elements
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextLong();
        }

        long sum = 0;  // Initialize the sum

        // Calculate the sum of array elements
        for (int i = 0; i < N; i++) {
            sum += array[i];
        }

        System.out.println(sum);  // Print the sum

        scanner.close();
    }
}

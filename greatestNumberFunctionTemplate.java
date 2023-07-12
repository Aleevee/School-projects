public class Main {

    public static <T extends Comparable<T>> T solution(T N1, T N2) {
        return (N1.compareTo(N2) > 0) ? N1 : N2;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int dataType = scanner.nextInt();

        if (dataType == 1) {
            int N1 = scanner.nextInt();
            int N2 = scanner.nextInt();
            System.out.println(solution(N1, N2));
        } else if (dataType == 2) {
            float N1 = scanner.nextFloat();
            float N2 = scanner.nextFloat();
            System.out.println(solution(N1, N2));
        } else if (dataType == 3) {
            char N1 = scanner.next().charAt(0);
            char N2 = scanner.next().charAt(0);
            System.out.println(solution(N1, N2));
        } else {
            System.out.println("Invalid data type.");
        }

        scanner.close();
    }
}

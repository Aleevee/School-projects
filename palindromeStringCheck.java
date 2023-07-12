public class Main {

    public static boolean isPalindrome(String str) {
        int length = str.length();

        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str = scanner.nextLine();

        if (isPalindrome(str)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

        scanner.close();
    }
}

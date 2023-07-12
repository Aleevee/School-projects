public class Main {

    public static boolean isUpperCaseString(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str = scanner.nextLine();

        if (isUpperCaseString(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}

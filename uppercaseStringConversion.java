public class Main {

    public static String convertToUpperCase(String str) {
        char[] chars = str.toCharArray();
        int length = chars.length;

        for (int i = 0; i < length; i++) {
            if (Character.isLowerCase(chars[i])) {
                chars[i] = (char) (chars[i] - 'a' + 'A');
            }
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(convertToUpperCase(str));
        scanner.close();
    }
}

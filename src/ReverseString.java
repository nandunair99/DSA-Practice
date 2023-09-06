import java.util.Scanner;

public class ReverseString {
    public static String reverseWord(String str) {
        char[] chars = str.toCharArray();

        if (str.length() <= 1) {
            return str;
        }
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                char temp = chars[i];
                chars[i] = chars[str.length() - 1 - i];
                chars[str.length() - 1 - i] = temp;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String reversed=reverseWord(sc.next());
        System.out.println(reversed);
    }
}
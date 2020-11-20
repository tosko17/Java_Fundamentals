package Lab;

import java.util.Scanner;

public class TextFilter_04 {
    private static String repearStr(String str, int length) {
        String replacment = "";
        for (int i = 0; i < length; i++) {
            replacment += str;
        }
        return replacment;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] bannedWords = scan.nextLine().split(", ");
        String input = scan.nextLine();

        for (String banWord : bannedWords) {
            if (input.contains(banWord)) {
                String replacement = repearStr("*", banWord.length());
                input = input.replace(banWord, replacement);
            }
        }
        System.out.println(input);
    }
}

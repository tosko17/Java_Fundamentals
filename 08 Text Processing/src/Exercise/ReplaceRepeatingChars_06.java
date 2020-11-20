package Exercise;

import java.util.Scanner;

public class ReplaceRepeatingChars_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder sb = new StringBuilder();

        char previousChar = input.charAt(0);
        sb.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (previousChar != currentChar) {

                sb.append(currentChar);
                previousChar = currentChar;
            }
        }
        System.out.println(sb);
    }

}

package Exercise;

import java.util.Scanner;

public class CaesarCipher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        for (char s : input.toCharArray()) {
            System.out.print((char) (s + 3));
        }
    }
}

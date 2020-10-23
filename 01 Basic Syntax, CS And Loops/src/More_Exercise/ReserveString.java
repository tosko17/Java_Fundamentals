package basic.syntax.conStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class ReserveString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String reserved = "";

        for (int i = 0; i < input.length(); i++) {
            reserved = input.charAt(i) + reserved;

        }
        System.out.println(reserved);
    }
}

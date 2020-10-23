package basic.syntax.conStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class Messages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());


        for (int i = 1; i <= n; i++) {
            String num = scan.nextLine();
            int length = num.length();
            int mainDigit = Integer.parseInt(num) % 10;

            if (mainDigit == 0) {
                System.out.print(" ");
                continue;
            } else if (mainDigit == 1) {
                continue;
            }
            int startingPoint = (mainDigit - 2) * 3;

            if (mainDigit == 8 || mainDigit == 9) {
                startingPoint += 1;
            }
            int digit = startingPoint + length - 1;
            System.out.printf("%c", 97 + digit);
        }

    }
}


package basic.syntax.conStatementsAndLoops.Lab;

import java.util.Scanner;

public class MultiplicationTableX2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        if (num2 < 11) {
            for (int i = num2; i <= 10; i++) {
                System.out.printf("%d X %d = %d%n", num, i, num * i);

            }
        } else System.out.printf("%d X %d = %d%n", num, num2, num * num2);
    }
}


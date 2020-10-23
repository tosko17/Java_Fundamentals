package basic.syntax.conStatementsAndLoops.Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        int printCount = 0;
        int number = 0;
        int sum = 0;

        while (printCount < n) {
            number++;
            if (number % 2 == 1) {
                System.out.println(number);
                printCount++;
                sum += number;
            }

        }
        System.out.printf("Sum: %d", sum);
    }
}


package basic.syntax.conStatementsAndLoops.Lab;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        while (number % 2 != 0) {
            System.out.println("Please write an even number.");
            number = scan.nextInt();
        }
        System.out.printf("The number is: %d", Math.abs(number));
    }
}

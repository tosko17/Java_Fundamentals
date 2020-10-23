package data.typesAndVariables.Lab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        boolean itIs = false;
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int number = i;

            while (number > 0) {
                sumOfDigits += number % 10;
                number /= 10;
            }
            itIs = (sumOfDigits == 5) || (sumOfDigits == 7) || (sumOfDigits == 11);


            if (!itIs) {

                System.out.printf("%d -> False%n", i);
            } else {
                System.out.printf("%d -> True%n", i);
            }
        }
    }
}

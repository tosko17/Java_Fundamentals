package Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Math.abs(Integer.parseInt(scan.nextLine()));

        System.out.println(totalSum(n));
    }

    private static int totalSum(int n) {
        int sumEven = sumEven(n);
        int sumOdd = sumOdd(n);

        return sumEven * sumOdd;
    }

    private static int sumEven(int n) {
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }

    private static int sumOdd(int n) {
        int sum = 0;
        int digit;
        while (n > 0) {
            digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n = n / 10;
        }
        return sum;
    }
}

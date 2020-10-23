package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = Integer.parseInt(scan.nextLine());

        int sum = 0;
        int left = 0;

        while (num > 0) {

            left = num % 10;
            sum += left;
            num /= 10;
        }
        System.out.println(sum);
    }
}

package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int dayCount = 0;
        int total = 0;

        if (n < 100) {

            System.out.printf("%d %n %d", dayCount, total);
        } else {

            for (int i = n; 100 <= i; i -= 10) {
                total += n - 26;
                dayCount++;
                n -= 10;
            }

            if (n <= 100) {

                System.out.printf("%d %n %d", dayCount, total - 26);
            }
        }
    }
}
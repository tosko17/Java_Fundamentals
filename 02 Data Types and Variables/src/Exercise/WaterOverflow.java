package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int quantities = 0;

        for (int i = 1; i <= n; i++) {
            int current = Integer.parseInt(scan.nextLine());
            quantities += current;

            if (quantities > 255) {
                quantities -= current;
                System.out.println("Insufficient capacity!");
            }
            if (i == n) {
                System.out.println(quantities);
            }
        }
    }
}

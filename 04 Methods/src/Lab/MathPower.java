package methods.Lab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double number = Double.parseDouble(scan.nextLine());
        int power = Integer.parseInt(scan.nextLine());
        System.out.println(new DecimalFormat("0.####").format
                (raisedNumberByPower(number, power)));

    }

    private static double raisedNumberByPower(double n, int p) {
        double finalNumber = 1;
        for (int i = 0; i < p; i++) {
            finalNumber *= n;

        }
        return finalNumber;
    }
}

package data.typesAndVariables.Lab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double meters = Double.parseDouble(scan.nextLine());
        double kilometers = meters / 1000;

        System.out.printf("%.2f", kilometers);
    }
}

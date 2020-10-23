package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double maxVolume = 0;
        String biggerKeg = "";

        for (int i = 1; i <= n; i++) {
            String model = scan.nextLine();
            double radius = Double.parseDouble(scan.nextLine());
            int height = Integer.parseInt(scan.nextLine());

            double currentVolume = Math.PI * radius * radius * height;

            if (currentVolume > maxVolume) {
                maxVolume = currentVolume;
                biggerKeg = model;
            }
            if (i == n) {

                System.out.println(biggerKeg);
            }
        }
    }
}
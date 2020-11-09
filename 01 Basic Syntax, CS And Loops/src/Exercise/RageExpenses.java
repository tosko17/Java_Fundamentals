package Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        double headsetCount = 0;
        double mouseCount = 0;
        double keyboardCount = 0;
        double displayCount = 0;

        for (int i = 1; i <= lostGamesCount; i++) {

            if (i % 2 == 0) {
                headsetCount++;
            }

            if (i % 3 == 0) {
                mouseCount++;
            }

            if (i % 2 == 0 && i % 3 == 0) {
                keyboardCount++;
            }
        }
        displayCount = Math.floor(keyboardCount / 2);
        double total = headsetPrice * headsetCount + mousePrice * mouseCount +
                keyboardPrice * keyboardCount + displayPrice * displayCount;

        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}

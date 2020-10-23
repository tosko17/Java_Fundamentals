package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class SnowBalls {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numberOfSnowballs = Integer.parseInt(scan.nextLine());

        int snowballValue = 0;
        int bestSnow = 0;
        int maxValue = 0;
        int minTime = 0;
        int bestQuality = 0;

        for (int i = 1; i <= numberOfSnowballs; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuality = Integer.parseInt(scan.nextLine());

            snowballValue = (int) Math.pow((snowballSnow / snowballTime), snowballQuality);

            if (snowballValue > maxValue) {
                bestSnow = snowballSnow;
                maxValue = snowballValue;
                minTime = snowballTime;
                bestQuality = snowballQuality;
            }

            if (i == numberOfSnowballs) {
                System.out.printf("%d : %d = %d (%d)", bestSnow, minTime,
                        maxValue, bestQuality);
            }

        }

    }
}

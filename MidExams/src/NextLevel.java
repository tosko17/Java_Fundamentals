import java.util.Scanner;

public class NextLevel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double amountOfExperience = Double.parseDouble(scan.nextLine());
        int battles = Integer.parseInt(scan.nextLine());
        double experienceLeft = 0;
        int countBattles = 0;

        while (experienceLeft < amountOfExperience) {
            countBattles++;
            double currentEx = Double.parseDouble(scan.nextLine());
            if (countBattles % 3 == 0) {
                currentEx = (currentEx + currentEx * 0.15);
            }
            if (countBattles % 5 == 0) {
                currentEx = (currentEx - currentEx * 0.10);
            }
            if (countBattles % 15 == 0) {
                currentEx = (currentEx + currentEx * 0.5);
            } else {
                experienceLeft += currentEx;
            }

            if (countBattles == battles) {
                break;
            }
        }
        if (experienceLeft > amountOfExperience) {
            System.out.printf("Player successfully collected his needed experience for %d battles.", countBattles);
        } else {
            double diff = amountOfExperience - experienceLeft;
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", diff);
        }
    }
}

package Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfGroup = scan.nextLine();
        String day = scan.nextLine();

        double totalPrice = 0;

        if (typeOfGroup.equals("Students")) {
            if (day.equals("Friday")) {
                totalPrice = numberOfPeople * 8.45;
            } else if (day.equals("Saturday")) {
                totalPrice = numberOfPeople * 9.80;
            } else if (day.equals("Sunday")) {
                totalPrice = numberOfPeople * 10.46;
            }
            if (numberOfPeople >= 30) {
                totalPrice -= totalPrice * 0.15;
            }
        }

        if (typeOfGroup.equals("Business")) {
            if (day.equals("Friday")) {
                totalPrice = numberOfPeople * 10.90;
            } else if (day.equals("Saturday")) {
                totalPrice = numberOfPeople * 15.60;
            } else if (day.equals("Sunday")) {
                totalPrice = numberOfPeople * 16;
            }
            if (numberOfPeople >= 100) {
                totalPrice -= (totalPrice / numberOfPeople) * 10;
            }
        }

        if (typeOfGroup.equals("Regular")) {
            if (day.equals("Friday")) {
                totalPrice = numberOfPeople * 15;
            } else if (day.equals("Saturday")) {
                totalPrice = numberOfPeople * 20;
            } else if (day.equals("Sunday")) {
                totalPrice = numberOfPeople * 22.50;
            }
            if (numberOfPeople >= 10 && numberOfPeople <= 20) {
                totalPrice -= totalPrice * 0.05;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}

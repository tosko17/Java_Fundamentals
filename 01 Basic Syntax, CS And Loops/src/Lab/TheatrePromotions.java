package basic.syntax.conStatementsAndLoops.Lab;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dayType = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        int ticketPrice = 0;

        if (0 <= age && age <= 18) {
            if (dayType.equals("Weekday")) {
                ticketPrice = 12;
            } else if (dayType.equals("Weekend")) {
                ticketPrice = 15;
            } else if (dayType.equals("Holiday")) {
                ticketPrice = 5;
            }
        } else if (18 < age && age <= 64) {
            if (dayType.equals("Weekday")) {
                ticketPrice = 18;
            } else if (dayType.equals("Weekend")) {
                ticketPrice = 20;
            } else if (dayType.equals("Holiday")) {
                ticketPrice = 12;
            }
        } else if (64 < age && age <= 122) {
            if (dayType.equals("Weekday")) {
                ticketPrice = 12;
            } else if (dayType.equals("Weekend")) {
                ticketPrice = 15;
            } else if (dayType.equals("Holiday")) {
                ticketPrice = 10;
            }
        }
        if (ticketPrice > 0) {

            System.out.println(ticketPrice + "$");
        } else System.out.println("Error!");


    }
}

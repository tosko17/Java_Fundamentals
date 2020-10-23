package basic.syntax.conStatementsAndLoops.Excercise;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = scan.nextLine();
        String password = scan.nextLine();
        String reserved = "";

        int counter = 0;

        for (int i = 0; i < username.length(); i++) {
            reserved = username.charAt(i) + reserved;

        }

        while (!password.equals(reserved)) {
            counter++;
            if (counter == 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");
            password = scan.nextLine();
        }
        System.out.printf("User %s logged in.", username);
    }
}
package methods.Exercises;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        boolean isBetween = checkIfIsBetween(password);
        boolean consists = checkIfConsists(password);
        boolean have2Digits = checkIfHave2Digits(password);


        if (isBetween && consists && have2Digits) {
            System.out.println("Password is valid");
        }

        if (!isBetween) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!consists) {
            System.out.println("Password must consist only of letters and digits");
        }

        if (!have2Digits) {
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean checkIfIsBetween(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean checkIfConsists(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            boolean isLetter = Character.isLetter(symbol);
            boolean isDigit = Character.isDigit(symbol);

            if (!isLetter && !isDigit) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfHave2Digits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }
}



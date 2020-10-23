package methods.Exercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char first = scan.nextLine().charAt(0);
        char second = scan.nextLine().charAt(0);


        printStringOfCharacters(first, second);
    }

    public static void printStringOfCharacters(char first, char second) {
        if (first < second) {
            for (char i = (char) (first + 1); i < second; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (char i = (char) (second + 1); i < first; i++) {
                System.out.print(i + " ");

            }
        }
    }
}

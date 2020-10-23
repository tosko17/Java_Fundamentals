package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class PrintPartOfTheAASCIITable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        for (int i = a; i <= b; i++) {

            char symbol = (char) i;

            System.out.printf("%c ", symbol);
        }
    }
}

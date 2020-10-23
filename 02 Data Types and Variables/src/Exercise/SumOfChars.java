package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class SumOfChars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int total = 0;


        for (int i = 1; i <= n; i++) {
            char letter = scan.nextLine().charAt(0);
            total += letter;
        }
        System.out.printf("The sum equals: %d", total);
    }
}

package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split(" ");


        for (int i = str.length - 1; i >= 0; i--) {
            System.out.print(str[i] + " ");

        }

    }
}
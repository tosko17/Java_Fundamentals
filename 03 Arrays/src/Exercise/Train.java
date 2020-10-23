package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int totalSum = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            int number = Integer.parseInt(scan.nextLine());
            numbers[i] = number;
            totalSum += numbers[i];

        }

        System.out.print(Arrays.toString(numbers).replace(",", "").replace("]", "")
                .replace("[", ""));
        System.out.println();
        System.out.print(totalSum);
    }
}

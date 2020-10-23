package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).
                mapToInt(Integer::parseInt).toArray();

        int sumEven = 0;
        int sumOdd = 0;


        for (int number : numbers) {

            if (number % 2 == 0) {
                sumEven += number;
            } else {
                sumOdd += number;
            }

        }

        System.out.print(sumEven - sumOdd);

    }
}

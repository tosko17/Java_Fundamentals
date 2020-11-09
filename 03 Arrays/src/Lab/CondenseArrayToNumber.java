package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        int[] num = new int[input.length];

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        while (num.length > 1) {
            int[] condensed = new int[num.length - 1];
            for (int i = 0; i < condensed.length; i++) {
                condensed[i] = num[i] + num[i + 1];
            }
            num = condensed;
        }
        System.out.println(Arrays.toString(num).replaceAll("[\\[\\],]", ""));
    }
}

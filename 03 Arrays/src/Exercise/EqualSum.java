package Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        if (numbers.length < 1) {
            System.out.print(0);
            return;
        }
        boolean isEquals = false;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;


            //left sum
            for (int j = i - 1; j >= 0; j--) {
                leftSum += numbers[j];
            }
            //right sum
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];
            }

            if (leftSum == rightSum) {
                isEquals = true;
                System.out.println(i);
                break;
            }
        }
        if (!isEquals) {
            System.out.print("no");
        }
    }
}

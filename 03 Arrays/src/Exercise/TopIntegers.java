package Exercise;


import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] numbers = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < numbers.length; i++) {
            boolean isTopInteger = true;
            int currentNum = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (currentNum <= numbers[j]) {
                    isTopInteger = false;
                }

            }
            if (isTopInteger) {
                System.out.print(currentNum + " ");
            }

        }
    }
}


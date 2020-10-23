package Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

        subtract(sum(num1, num2), num3);

    }

    private static int sum(int num1, int num2) {
        int totalSum = num1 + num2;
        return totalSum;
    }


    private static void subtract(int sum, int num3) {
        int totalSubtract = sum - num3;

        System.out.println(totalSubtract);
    }
}
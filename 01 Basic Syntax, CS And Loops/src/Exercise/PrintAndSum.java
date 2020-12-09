package Exercise;

import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        int total = 0;


        for (int i = num1; i <= num2; i++) {
            System.out.printf("%d ", i);
            total += i;
        }
        System.out.println();
        System.out.printf("Sum: %d", total);


    }
}

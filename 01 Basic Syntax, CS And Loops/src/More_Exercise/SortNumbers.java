package basic.syntax.conStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());
        int num3 = Integer.parseInt(scan.nextLine());

      int max = Math.max(num1,Math.max(num2,num3));
      int min = Math.min(num1,Math.min(num2,num3));

      int total = num1 + num2 + num3;
      int medium = total - max - min;

        System.out.println(max);
        System.out.println(medium);
        System.out.println(min);
    }
}

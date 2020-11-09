package Exercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int number;
        int[] first = new int[n];
        int[] second = new int[n];

        for (int i = 0; i < first.length; i++) {
            if (i % 2 == 0) {
                number = scan.nextInt();
                first[i] = number;
                number = scan.nextInt();
                second[i] = number;
            } else {
                number = scan.nextInt();
                second[i] = number;
                number = scan.nextInt();
                first[i] = number;
            }


        }
        for (int k : first) {

            System.out.print(k + " ");


        }
        System.out.println();
        for (int j : second) {

            System.out.print(j + " ");

        }

    }
}
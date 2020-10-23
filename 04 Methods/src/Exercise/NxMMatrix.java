package methods.Exercises;

import java.util.Scanner;

public class NxMMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        matrix(n);
    }

    private static void matrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print(n + " ");
            }
            System.out.println(n + " ");
        }
    }
}

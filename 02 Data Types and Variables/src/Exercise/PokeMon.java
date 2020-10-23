package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nOriginal = Integer.parseInt(scan.nextLine());  // The  power of PokeMon
        int m = Integer.parseInt(scan.nextLine());          // The distance from the target
        int y = Integer.parseInt(scan.nextLine());          // exhaustionFactor

        int countOfTargets = 0;
        int n = nOriginal;

        while (nOriginal >= m) {
            nOriginal -= m;
            countOfTargets++;


            if (nOriginal * 2 == n && y != 0) {
                nOriginal /= y;

            }


        }

        System.out.println(nOriginal);
        System.out.println(countOfTargets);
    }
}

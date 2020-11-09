package Exercise;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] array = scan.nextLine().split(" ");
        int rotations = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotations; i++) {
            String firstElement = array[0];

            System.arraycopy(array, 1, array, 0, array.length - 1);
            array[array.length - 1] = firstElement;
        }
        for (String s : array) {

            System.out.print(s + " ");
        }

    }
}


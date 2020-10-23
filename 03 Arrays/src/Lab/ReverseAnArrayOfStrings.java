package Lab;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayOfStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();
        String[] items = str.split(" ");
        int[] arr = new int[items.length];


        for (int i = 0; i<items.length; i++) {
         //   arr[i] = char(Integer.parseInt(items[i]=);
        }

        System.out.println(Arrays.toString(arr));
    }
}
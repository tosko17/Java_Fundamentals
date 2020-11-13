package Lab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int n = Integer.parseInt(scan.nextLine());
        System.out.println(repeatString(input, n));

    }

    private static String repeatString(String str, int n) {
        String reserved = "";
        for (int i = 0; i < n; i++) reserved += str;
        return reserved;

    }
}

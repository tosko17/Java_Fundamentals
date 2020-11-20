package Lab;

import java.util.Scanner;

public class ReverseStrings_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        while (!input.equals("end")) {
            StringBuilder reserved = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reserved.append(input.charAt(i));
            }
            System.out.printf("%s = %s%n", input, reserved);
            input = scan.nextLine();
        }
    }
}

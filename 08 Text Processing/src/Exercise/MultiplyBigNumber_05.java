package Exercise;

import java.util.Scanner;
import java.util.stream.Stream;

public class MultiplyBigNumber_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String first = scan.nextLine().replaceFirst("^0+", "");
        int second = Integer.parseInt(scan.nextLine());

        if (second == 0) {
            System.out.println(0);
            return;
        }

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = first.length() - 1; i >= 0; i--) {
            int digit = Integer.parseInt(String.valueOf(first.charAt(i)));
            int result = digit * second + carry;
            if (i == 0) {
                sb.insert(0, result);
            } else {

                int restDigit = result % 10;
                carry = result / 10;

                sb.insert(0, restDigit);
            }
        }

        System.out.println(sb);
    }
}

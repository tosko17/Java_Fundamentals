package Exercise;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] first = scan.nextLine().split(" ");
        String[] second = scan.nextLine().split(" ");

        for (String s : second) {
            for (String value : first) {
                if (s.equals(value)) {
                    System.out.print(s + " ");
                }


            }
        }
    }
}

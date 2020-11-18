package Lab;

import java.util.Scanner;

public class LiveDemo_00 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s = "Hi";
        //String s = new String(new char[] { 'H', 'i'});

        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(a.equals(b));
    }
}

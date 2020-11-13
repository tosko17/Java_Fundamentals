package Exercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String number = scan.nextLine();
        while (!number.equals("END")) {
            if (number.charAt(0) == number.charAt(number.length()-1)){
                System.out.print("true");
            }else
                System.out.print("false");
            System.out.println();

            number = scan.nextLine();
        }
    }
}


package Lab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char char1 = scan.nextLine().charAt(0);

        if (char1 == 'a' || char1 == 'b' || char1 == 'c' || char1 == 'd' || char1 == 'e' || char1 == 'f'
                || char1 == 'g' || char1 == 'h' || char1 == 'i' || char1 == 'j' || char1 == 'k' || char1 == 'l'
                || char1 == 'm' || char1 == 'n' || char1 == 'ñ' || char1 == 'o' || char1 == 'p' || char1 == 'q'
                || char1 == 'r' || char1 == 's' || char1 == 't' || char1 == 'u' || char1 == 'v' || char1 == 'w'
                || char1 == 'x' || char1 == 'y' || char1 == 'z') {
            System.out.println("lower-case");
        }
        if (char1 == 'A' || char1 == 'B' || char1 == 'C' || char1 == 'D' || char1 == 'E' || char1 == 'F'
                || char1 == 'G' || char1 == 'H' || char1 == 'I' || char1 == 'J' || char1 == 'K' || char1 == 'L'
                || char1 == 'M' || char1 == 'N' || char1 == 'Ñ' || char1 == 'O' || char1 == 'P' || char1 == 'Q'
                || char1 == 'R' || char1 == 'S' || char1 == 'T' || char1 == 'U' || char1 == 'V' || char1 == 'W'
                || char1 == 'X' || char1 == 'Y' || char1 == 'Z') {
            System.out.println("upper-case");
        }
    }
}
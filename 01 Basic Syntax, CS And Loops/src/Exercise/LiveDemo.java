package Exercise;

import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nombre = scan.nextLine();

        char caracter = nombre.charAt(2);

        System.out.println(caracter);
    }
}

package data.typesAndVariables.Lab;

import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        String name2 = scan.nextLine();
        String delimiter = scan.nextLine();

        System.out.printf("%s%s%s", name, delimiter, name2);
    }
}

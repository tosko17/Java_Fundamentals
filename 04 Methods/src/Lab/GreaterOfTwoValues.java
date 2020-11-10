package Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();

        switch (type) {
            case "int":
                int a = Integer.parseInt(scan.nextLine());
                int b = Integer.parseInt(scan.nextLine());
                System.out.println(getMax(a, b));
                break;
            case "char":
                char first = scan.next().charAt(0);
                char second = scan.next().charAt(0);
                System.out.println(getMax(first, second));
                break;
            case "string":
                String una = scan.nextLine();
                String dos = scan.nextLine();
                System.out.println(getMax(una, dos));
                break;
        }


    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static char getMax(char a, char b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static String getMax(String a, String b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else if (a.compareTo(b) <= 0) {
            return b;
        } else {
            return a;
        }
    }
}

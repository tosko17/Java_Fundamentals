package Lab;

import java.util.Scanner;

public class nuevo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double a = Double.parseDouble(scan.nextLine());
        double b = Double.parseDouble(scan.nextLine());
        double result = a / b;

        System.out.printf("%f * %f = %.2f",a,b,result);
    }
}

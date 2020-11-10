package Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        System.out.printf("%.2f", calculate(a, operator, b));

    }

    private static double calculate(int a, String operator, int b) {
        double result = 0.0;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a * 1.0 / b;
                break;
        }

        return result;
    }
}

package Lab;

import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int b = Integer.parseInt(scan.nextLine());

        System.out.printf("%d", calculate(a, operator, b));

    }

    private static int calculate(int a, String operator, int b) {
        int result = 0;

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
                result = a / b;
                break;
        }

        return result;
    }
}

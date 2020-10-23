package methods.Lab;

import java.util.Scanner;


public class CalculateRectangleArea {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double width = Double.parseDouble(scan.nextLine());
        double length = Double.parseDouble(scan.nextLine());
        double area = rectangleArea(width, length);
        System.out.printf("%.0f%n", area);
    }

    private static double rectangleArea(double width, double length) {

        return width * length;
    }
}

package methods.Lab;

import java.util.Scanner;


public class Orders {
    public static void totalPriceOrder(String product, double quantity) {
        if (product.equals("coffee")) {
            quantity *= 1.50;
        } else if (product.equals("water")) {
            quantity *= 1.00;
        } else if (product.equals("coke")) {
            quantity *= 1.40;
        } else {
            quantity *= 2.00;
        }
        System.out.printf("%.2f", quantity);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());

        switch (product) {
            case "coffee":
                totalPriceOrder(product, quantity);
                break;
            case "water":
                totalPriceOrder(product, quantity);
                break;
            case "coke":
                totalPriceOrder(product, quantity);
                break;
            case "snacks":
                totalPriceOrder(product, quantity);
                break;
            default:
                break;
        }
    }
}

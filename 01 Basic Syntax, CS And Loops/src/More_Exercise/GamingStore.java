package basic.syntax.conStatementsAndLoops.MoreExcercise;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double currentSpend = 0;
        double totalMoney = Double.parseDouble(scan.nextLine());
        String input = scan.nextLine();

        while (!input.equals("Game Time")) {
            switch (input) {
                case "CS: OG":
                    if (totalMoney >= 15.99) {
                        totalMoney -=15.99;
                        currentSpend += 15.99;
                        System.out.println("Bought CS: OG");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Zplinter Zell":
                    if (totalMoney >= 19.99) {
                        totalMoney -=19.99;
                        currentSpend += 19.99;
                        System.out.println("Bought Zplinter Zell");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;

                case "RoverWatch":
                    if (totalMoney >= 29.99) {
                        totalMoney -=29.99;
                        currentSpend += 29.99;
                        System.out.println("Bought RoverWatch");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "OutFall 4":
                    if (totalMoney >= 39.99) {
                        totalMoney -=39.99;
                        currentSpend += 39.99;
                        System.out.println("Bought OutFall 4");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "RoverWatch Origins Edition":
                    if (totalMoney >= 39.99) {
                        totalMoney -=39.99;
                        currentSpend += 39.99;
                        System.out.println("Bought RoverWatch Origins Edition");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                case "Honored 2":
                    if (totalMoney >= 59.99) {
                        totalMoney -=59.99;
                        currentSpend += 59.99;
                        System.out.println("Bought Honored 2");
                    } else {
                        System.out.println("Too Expensive");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }


            if (0 >= totalMoney) {
                System.out.println("Out of money!");
                return;
            }
            input = scan.nextLine();
        }

            System.out.printf("Total spent: $%.2f. Remaining: $%.2f", currentSpend, totalMoney);

    }
}

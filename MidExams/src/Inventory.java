import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> inventory = Arrays.stream(scan.nextLine().split(", "))
                .collect(Collectors.toList());

        String input = scan.nextLine();
        while (!input.equals("Craft!")) {
            String[] tokens = input.split(" - ");
            String command = tokens[0];
            String item = tokens[1];

            switch (command) {
                case "Collect":
                    if (!inventory.contains(item)) {
                        inventory.add(item);
                    }
                    break;
                case "Drop":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                    }
                    break;
                case "Combine Items":
                    String[] combinedItems = item.split(":");
                    String oldItem = combinedItems[0];
                    String newItem = combinedItems[1];

                    if (inventory.contains(oldItem)) {
                        int index = inventory.indexOf(oldItem);
                        inventory.add(index + 1, newItem);
                    }
                    break;
                case "Renew":
                    if (inventory.contains(item)) {
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
            }

            input = scan.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}

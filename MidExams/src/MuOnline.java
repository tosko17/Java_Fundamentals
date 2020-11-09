import java.util.List;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int health = 100;
        int bitcoins = 0;

        String[] rooms = scan.nextLine().split("\\|");

        for (int i = 0; i < rooms.length; i++) {
            String[] currentRoom = rooms[i].split("\\s+");
            String command = currentRoom[0];
            int number = Integer.parseInt(currentRoom[1]);

            switch (command) {
                case "potion":
                    if (health + number > 100) {
                        number = 100 - health;
                    }
                    health += number;
                    System.out.printf("You healed for %d hp.%n", number);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += number;
                    System.out.printf("You found %d bitcoins.%n", number);
                    break;
                default:
                    if (health - number <= 0) {
                        System.out.println(String.format("You died! Killed by %s.", command));
                        System.out.printf("Best room: %d", (i + 1));
                        return;
                    } else {
                        health -= number;
                        System.out.printf("You slayed %s.%n", command);
                    }

            }
        }
        System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d", bitcoins, health);
    }
}

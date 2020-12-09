package Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> people = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String[] tokens = scan.nextLine().split("\\s+");
            String name = tokens[0];
            if (tokens.length == 3) {
                if (people.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    people.add(name);
                }
            } else {
                if (!people.remove(name)) {
                    System.out.println(name + " is not in the list!");
                }
            }
        }
        for (String person : people) {
            System.out.println(person);

        }
    }

}

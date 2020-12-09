package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> wagons = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[]  tokens = input.split("\\s+");

            if (tokens[0].equals("Add")) {
                int passengers = Integer.parseInt(tokens[1]);
                wagons.add(passengers);
            } else {
                int passengers = Integer.parseInt(tokens[0]);
                for (int i = 0; i < wagons.size(); i++) {
                    int totalPassengers = wagons.get(i) + passengers;
                    if (totalPassengers <= maxCapacity) {
                        wagons.set(i, totalPassengers);
                        break;
                    }
                }
            }

            input = scan.nextLine();
        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }
    }
}

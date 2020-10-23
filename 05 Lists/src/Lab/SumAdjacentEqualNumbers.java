package Lab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> numbers = parseLineOfNumbers(scan);

        boolean search = true;
        while (search) {
            search = false;
            for (int i = 0; i < numbers.size() - 1; i++) {
                double current = numbers.get(i);
                double nextNumber = numbers.get(i + 1);
                if (current == nextNumber) {
                    search = true;
                    numbers.remove(i);
                    numbers.set(i, current + nextNumber);
                    break;
                }
            }

        }

        for (Double number : numbers) {
            System.out.print(new DecimalFormat("0.#").format(number) + " ");
        }

    }

    private static List<Double> parseLineOfNumbers(Scanner scan) {
        String line = scan.nextLine();

        String[] numbersAsStrings = line.split(" ");

        List<Double> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            double number = Double.parseDouble(s);
            numbers.add(number);
        }
        return numbers;
    }


}
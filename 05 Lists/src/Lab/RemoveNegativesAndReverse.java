package Lab;

import java.util.*;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numbers = parseLineOfNumbers(scan);

        for (int i = 0; i < numbers.size(); i++) {
            int number = numbers.get(i);
            if (number < 0) {
                numbers.remove(i);
                i -= 1;
            }
        }

        Collections.reverse(numbers);
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
        if (numbers.isEmpty()) {
            System.out.println("empty");
        }
    }

    private static List<Integer> parseLineOfNumbers(Scanner scan) {
        String line = scan.nextLine();

        String[] numbersAsStrings = line.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (String s : numbersAsStrings) {
            int number = Integer.parseInt(s);
            numbers.add(number);
        }
        return numbers;
    }
}

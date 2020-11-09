import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        int[] array = parseArray(line);
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        double average = sum * 1.0 / array.length;

        List<Integer> aboveAverage = new ArrayList<>();
        for (int number : array) {
            if (number > average) {
                aboveAverage.add(number);
            }
        }
        if (aboveAverage.isEmpty()) {
            System.out.println("No");
        } else {


            Collections.sort(aboveAverage);
            Collections.reverse(aboveAverage);

            for (int i = 0; i < Math.min(aboveAverage.size(), 5); i++) {
                System.out.print(aboveAverage.get(i) + " ");

            }
        }
    }

    private static int[] parseArray(String line) {
        String[] numbersAsString = line.split(" ");
        int[] array = new int[numbersAsString.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }
}

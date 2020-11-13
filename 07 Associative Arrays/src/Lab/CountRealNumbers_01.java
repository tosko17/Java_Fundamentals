package Lab;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Double, Integer> numberRepetitations = new TreeMap<>();

        String[] numbersAsStrings = scan.nextLine().split(" ");

        for (String numbersAsString : numbersAsStrings) {
            double number = Double.parseDouble(numbersAsString);

            Integer occurences = numberRepetitations.get(number);

            if (occurences == null) {
                occurences = 0;
            }

            numberRepetitations.put(number, occurences + 1);

        }

        for (Map.Entry<Double, Integer> entry : numberRepetitations.entrySet()) {
            DecimalFormat df = new DecimalFormat("#.#######");
            System.out.printf("%s -> %d%n", df.format(entry.getKey()), entry.getValue());
        }

    }

}

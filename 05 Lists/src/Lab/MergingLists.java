package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> firsList = parseLineOfNumbers(scan);
        List<Integer> secondList = parseLineOfNumbers(scan);

        List<Integer> mergedList = new ArrayList<>();

        int indexInFirst = 0;
        int indexInSecond = 0;

        while (indexInFirst < firsList.size() || indexInSecond < secondList.size()) {
            if (indexInFirst < firsList.size()) {

                mergedList.add(firsList.get(indexInFirst));
            }
            if (indexInSecond < secondList.size()) {

                mergedList.add(secondList.get(indexInSecond));
            }

            indexInFirst++;
            indexInSecond++;
        }
        for (int number : mergedList) {
            System.out.print(number + " ");
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

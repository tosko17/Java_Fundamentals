import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String line = scan.nextLine();
        int[] array = parseArray(line);

        String input = scan.nextLine();
        while (!input.equals("end")) {
            String[] commandAndParameters = input.split(" ");

            switch (commandAndParameters[0]) {
                case "swap":
                    swap(array, Integer.parseInt(commandAndParameters[1]), Integer.parseInt(commandAndParameters[2]));
                    break;
                case "multiply":
                    multiply(array, Integer.parseInt(commandAndParameters[1]), Integer.parseInt(commandAndParameters[2]));
                    break;
                case "decrease":
                    decrease(array);
                    break;
            }

            input = scan.nextLine();
        }

        printArray(", ", array);


    }

    private static void printArray(String separator, int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(separator);
            }
        }
        System.out.println();
    }


    private static int[] parseArray(String line) {
        String[] numbersAsString = line.split(" ");
        int[] array = new int[numbersAsString.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numbersAsString[i]);
        }
        return array;
    }

    private static void swap(int[] array, int indexA, int indexB) {
        int oldA = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = oldA;
    }

    private static void multiply(int[] array, int indexA, int indexB) {
        array[indexA] = array[indexA] * array[indexB];
    }

    private static void decrease(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i]--;

        }
    }

}

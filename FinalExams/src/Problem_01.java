import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Done")) {
            String word = command[0];
            switch (word) {
                case "Change":
                    String existedChar = command[1];
                    String replacement = command[2];
                    input = input.replace(existedChar, replacement);
                    System.out.println(input);
                    break;
                case "Includes":
                    String part = command[1];
                    if (input.contains(part)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String lastPart = command[1];
                    if (input.endsWith(lastPart)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    System.out.println(input);
                    break;
                case "FindIndex":
                    String symbol = command[1];
                    int index = input.indexOf(symbol);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    input = input.substring(startIndex, startIndex + endIndex);
                    System.out.println(input);
                    break;
            }

            command = scanner.nextLine().split("\\s+");
        }
    }
}


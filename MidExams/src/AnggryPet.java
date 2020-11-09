
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnggryPet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int entryPoint = Integer.parseInt(scanner.nextLine());
        String items = scanner.nextLine();
        String price = scanner.nextLine();
        int totalLeft = 0;
        int totalRight = 0;
        switch (items) {
            case "cheap":
                for (int i = 0; i < integerList.size() - 1; i++) {
                    if ((integerList.get(i)) > integerList.get(entryPoint)) {
                        integerList.set(i, 0);
                    }

                }
                break;
            case "expensive":
                for (int i = 0; i < integerList.size() - 1; i++) {
                    if ((integerList.get(i)) < integerList.get(entryPoint)) {
                        integerList.set(i, 0);
                    }

                }
                break;
        }
        switch (price) {
            case "positive":
                for (int i = 0; i < integerList.size() - 1; i++) {
                    if ((integerList.get(i)) < 0) {
                        integerList.set(i, 0);
                    }
                }
                break;
            case "negative":
                for (int i = 0; i < integerList.size() - 1; i++) {
                    if ((integerList.get(i)) > 0) {
                        integerList.set(i, 0);
                    }
                }
                break;

        }
        for (int i = 0; i < entryPoint; i++) {
            totalLeft += integerList.get(i);

        }
        for (int i = entryPoint + 1; i < integerList.size() - 1; i++) {
            totalRight += integerList.get(i);

        }
        if (totalLeft >= totalRight) {
            System.out.printf("Left - %d", totalLeft);
        } else {
            System.out.printf("Right - %d", totalRight);
        }
    }
}
 
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AngryPet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine()
                .split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int entryPoint = Integer.parseInt(scan.nextLine());
        String item = scan.nextLine();
        String price = scan.nextLine();
        int damageLeft = 0;
        int damageRight = 0;

        for (int i = 0; i < numbers.get(entryPoint - 1); i++) {
            switch (item) {
                case "cheap":
                    if (price.equals("positive")) {
                        if (numbers.get(i) < numbers.get(entryPoint) && numbers.get(i) >= 0) {
                            damageLeft += numbers.get(i);
                        }
                    } else if (price.equals("negative")) {
                        if (numbers.get(i) < numbers.get(entryPoint) && numbers.get(i) < 0) {
                            damageLeft += numbers.get(i);
                        }
                    } else if ((numbers.get(i) < numbers.get(entryPoint))) {
                        damageLeft += numbers.get(i);
                    }
                    continue;
                case "expensive":
                    if (price.equals("positive")) {
                        if (numbers.get(i) >= numbers.get(entryPoint) && numbers.get(i) >= 0) {
                            damageLeft += numbers.get(i);
                        }
                    } else if (price.equals("negative")) {
                        if (numbers.get(i) >= numbers.get(entryPoint) && numbers.get(i) < 0) {
                            damageLeft += numbers.get(i);
                        }
                    } else if ((numbers.get(i) >= numbers.get(entryPoint))) {
                        damageLeft += numbers.get(i);
                    }

            }
        }

        for (int i = entryPoint + 1; i < numbers.size(); i++) {
            switch (item) {
                case "cheap":
                    if (price.equals("positive")) {
                        if (numbers.get(i) < numbers.get(entryPoint) && numbers.get(i) >= 0) {
                            damageRight += numbers.get(i);
                        }
                    } else if (price.equals("negative")) {
                        if (numbers.get(i) < numbers.get(entryPoint) && numbers.get(i) < 0) {
                            damageRight += numbers.get(i);
                        }
                    } else if ((numbers.get(i) < numbers.get(entryPoint))) {
                        damageRight += numbers.get(i);
                    }
                    continue;

                case "expensive":
                    break;
            }
        }

        if (damageLeft >= damageRight) {
            System.out.println("Left - " + (damageLeft));
        } else {
            System.out.println("Right - " + (damageRight));
        }

    }
}
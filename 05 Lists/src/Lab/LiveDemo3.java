package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiveDemo3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int number = scan.nextInt();
            numbers.add(number);

        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }



    }
}

package Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class LiveDemo2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int number = scan.nextInt();
        while(number != 0){
            numbers.add(number);
            number = scan.nextInt();
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            System.out.print(numbers.get(i) + " ");

        }
    }
}

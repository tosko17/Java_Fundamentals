package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiveDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(42);
        list.add(13);
        list.add(255);
        System.out.println(list.size());
        System.out.println(list.get(0));
        list.set(0,12);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}

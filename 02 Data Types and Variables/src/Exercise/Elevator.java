package data.typesAndVariables.Excercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int p = Integer.parseInt(scan.nextLine());

        int courses = (int) Math.ceil((double) n / p);

        System.out.println(courses);
    }

}

package methods.Exercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());
        int thirdNum = Integer.parseInt(scan.nextLine());

        int smallerNumber = findSmallerNumber(firstNum, secondNum);
        int theSmallestNumber = findSmallerNumber(smallerNumber, thirdNum);

        System.out.println(theSmallestNumber);
    }

    public static int findSmallerNumber(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }
}

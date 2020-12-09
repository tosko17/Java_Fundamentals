package Exercise;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        System.out.println(sumNums(a,b));
    }

    private static int sumNums (int a, int b){
        return a + b;
    }
}

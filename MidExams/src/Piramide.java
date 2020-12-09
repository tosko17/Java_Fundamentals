import java.util.Scanner;

public class Piramide {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        int num = scan.nextInt();

        for (int i = 1; i <= num ; i++ ,  k = 0) {
            for (int j = 1; j <= num - i; ++j) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}

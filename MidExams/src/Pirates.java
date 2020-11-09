import java.util.Scanner;

public class Pirates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int days = Integer.parseInt(scan.nextLine());
        int dailyPlunder = Integer.parseInt(scan.nextLine());
        double expectedPlunder = Double.parseDouble(scan.nextLine());

        double bonus = 0;
        double total = 0;
        for (int i = 1; i <= days; i++) {
            if (i % 3 == 0) {
                bonus = dailyPlunder * 0.5;
            }
            total += dailyPlunder * 1.0 + bonus;
            bonus = 0;

            if (i % 5 == 0) {
                total -= total * 0.3;
            }
        }

        if (expectedPlunder <= total) {
            System.out.printf("Ahoy! %.2f plunder gained.", total);
        } else {
            double percent = total / (expectedPlunder / 100);
            System.out.printf("Collected only %.2f%% of the plunder.", percent);
        }
    }
}

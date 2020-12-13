import java.util.Scanner;
import java.util.regex.Pattern;

public class ProblemTest_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Pattern pattern = Pattern.compile("^([$%])([A-Z][a-z]{2,})\\1: \\[(\\d+)\\]\\|\\[(\\d+)\\]\\|\\[(\\d+)\\]\\|$");

        for (int i = 0; i < n; i++) {
            String input = scan.nextLine();
        }
    }
}

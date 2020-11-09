import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int students = Integer.parseInt(scan.nextLine());
        int lectures = Integer.parseInt(scan.nextLine());
        int theInitialBonus = Integer.parseInt(scan.nextLine());

        double max = 0;
        int maxLectures = 0;

        for (int i = 0; i < students; i++) {
            int attendancesOfEachStudent = Integer.parseInt(scan.nextLine());

            double totalBonus = attendancesOfEachStudent * 1.0 / lectures * (5 + theInitialBonus);

            if (totalBonus > max) {

                max = totalBonus;
                maxLectures = attendancesOfEachStudent;
            }
        }


        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(max));
        System.out.printf("The student has attended %d lectures.", maxLectures);
    }

}


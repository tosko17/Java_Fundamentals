import java.util.Scanner;

public class SoftUniReception {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int studentsForHour = scan.nextInt() + scan.nextInt() + scan.nextInt();
        int numberOfStudents = scan.nextInt();
        int hourCount = 0;

        while (numberOfStudents > 0) {
            hourCount++;
            numberOfStudents -= studentsForHour;

            if (hourCount % 4 == 0) {
                numberOfStudents += studentsForHour;
            }

        }
        System.out.println("Time needed: " + hourCount + "h.");


    }
}

package Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double totalMoney = Double.parseDouble(scan.nextLine());
        int numberOfStudents = Integer.parseInt(scan.nextLine());
        double lightSabersPrice = Double.parseDouble(scan.nextLine());
        double robesPrice = Double.parseDouble(scan.nextLine());
        double beltsPrice = Double.parseDouble(scan.nextLine());

        double beltsDiscount = 0;
        double students10 = Math.ceil(numberOfStudents + numberOfStudents * 0.1);

        if (numberOfStudents >= 6) {
            beltsDiscount = Math.floor(numberOfStudents * 1.0 / 6);
        } else
            beltsDiscount = 0;
        double countMoney = students10 * lightSabersPrice + numberOfStudents * robesPrice +
                beltsPrice * (numberOfStudents - beltsDiscount);

        if (totalMoney >= countMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", countMoney);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.", countMoney - totalMoney);
        }

    }
}

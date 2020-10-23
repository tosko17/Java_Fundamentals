package basic.syntax.conStatementsAndLoops.Lab;

import java.util.Scanner;

public class BackIn30Minutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int hour = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine()) + 30;

        int hourcount = 0;


        if (minutes > 59) {
            minutes -= 60;
            hourcount++;
        }
        if (hour + hourcount > 23) {
            hour = 0;
        } else {
            hour += hourcount;
        }


            System.out.printf("%d:%02d", hour, minutes);
        }
    }


package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LiveDemo1 {
    class Reservation {
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> reservationHolders = new ArrayList<>();
        List<Integer> reservationSeats = new ArrayList<>();

        String input = scan.nextLine();

        while (!input.equals("end")){
            String[] nameAndSeats = input.split(" ");
            reservationHolders.add(nameAndSeats[0]);
            reservationSeats.add(Integer.parseInt(nameAndSeats[1]));

            input = scan.nextLine();
        }
        String guestName = scan.nextLine();
        int reservationIndex = reservationHolders.indexOf(guestName); /*       int reservationIndex = -1;
                                                                             for (int i = 0; i < reservationHolders.size(); i++) {
                                                                                 if (guestName.equals(reservationHolders.get(i))){
                                                                                 reservationIndex = i;
                                                                                     }
                                                                                  } */

        //Es lo mismo pero en completo.

        if (reservationIndex!=-1){
            System.out.println(reservationSeats.get(reservationIndex));
        }else {
            System.out.printf("No reservation for %s.",guestName);
        }
    }
}

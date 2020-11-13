package Lab;

import java.util.*;

public class LiveDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> infectedByCity = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        String command = scan.next();

        while (!command.equals("end")){
            if (command.equals("report")){
                String cityName = scan.next();

                infectedByCity.get(cityName);

                System.out.println(infectedByCity.get(cityName));
            }else{
                int infected = scan.nextInt();

                Integer currentInfected = infectedByCity.get(command);
                if (currentInfected == null){
                    currentInfected = 0;
                }
                infectedByCity.put(command,currentInfected + infected);
            }

            command= scan.next();
        }

        for (Map.Entry<String, Integer> entry : infectedByCity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}

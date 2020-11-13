package Lab;

import java.util.*;

public class LiveDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> infectedByCity = new HashMap<>();

        int firstDay = 15;          //infectados primer dia.
        int secondDay = 40;         //infectados segundo dia.

        infectedByCity.put("Madrid", firstDay);         //le asignamos infectados del primer dia.
        int current = infectedByCity.get("Madrid");     // en la variable le asignamos hasta ahora cuantos hay para Madrid
        infectedByCity.put("Madrid", current + secondDay);  //lo que tenemos hasta ahora + los infectados del segundo dia

        infectedByCity.put("Barcelona", 42);
        infectedByCity.put("Valencia", 13);

        System.out.println(infectedByCity.get("Madrid"));   //Imprimimos la suma del primer y segundo dia.
        System.out.println(infectedByCity.get("Barcelona"));
        System.out.println(infectedByCity.get("Valencia"));
    }
}

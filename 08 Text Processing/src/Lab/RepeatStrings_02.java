package Lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] words = scan.nextLine().split(" ");

        List<String> repeatedWords = new ArrayList<>();

        for (int i = 0; i < words.length ; i++) {
            repeatedWords.add(repeat(words[i], words[i].length()));
            System.out.print(String.join("",repeatedWords));
        }


    }

    private static String repeat (String word, int count){
        String[] repeatArr = new String[count];
        for (int i = 0; i <count ; i++) {
            repeatArr[i] = word;

        }
        return String.join("", repeatArr);
    }
}

package methods.Exercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.nextLine();

        vowelsInAWord(word);


    }

    private static void vowelsInAWord(String word) {
        int countVowels = 0;
        for (int i = 0; i < word.length(); i++) {
            char symbol = word.charAt(i);

            if (symbol == 'A' || symbol == 'a' || symbol == 'E' || symbol == 'e' || symbol == 'I' ||
                    symbol == 'i' || symbol == 'O' || symbol == 'o' || symbol == 'U' || symbol == 'u') {

                countVowels++;
            }

        }
        System.out.println(countVowels);
    }
}

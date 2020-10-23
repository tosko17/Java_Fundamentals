package methods.Exercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String singleString = scan.nextLine();

        middleCharacters(singleString);
    }

    private static void middleCharacters(String something){
        int start = 0;
        char symbol = ' ';
        for (int i = 1; i <=something.length() ; i++) {
            symbol = something.charAt(i);

        }

        if (something.length() % 2 ==0 ){
            start = something.length() / 2 ;
            System.out.println();
        }else {
            start = something.length() /2 + 1;
            System.out.println();
        }
    }
}

package Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

      String input = scan.nextLine();
      while (!input.equals("end")){
          String[] tokens = input.split("\\s+");
          if (tokens[0].equals("Delete")){

          }else{

          }

          input = scan.nextLine();
      }
    }
}

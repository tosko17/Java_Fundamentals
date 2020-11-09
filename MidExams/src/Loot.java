import java.util.*;
import java.util.stream.Collectors;

public class Loot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> chestContentList = Arrays.stream(scanner.nextLine().split("\\|"))
                .collect(Collectors.toList());


        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {

            String[] command = input.split(" ");
            String currentCommand = command[0];
            switch (currentCommand) {
                case "Loot":
                    for (int i = 1; i < command.length; i++) {
                        if (!chestContentList.contains(command[i])) {
                            chestContentList.add(0, command[i]);
                        }
                    }
                    break;
                case "Drop":
                    int dropIndex = Integer.parseInt(command[1]);
                    if (dropIndex < 0 || dropIndex >= chestContentList.size()) {
                        break;
                    } else {
                        chestContentList.add(chestContentList.remove(dropIndex));
                    }
                    break;
                case "Steal":
                    int stealAmount = Integer.parseInt(command[1]);
                    List<String> stolen = new ArrayList<>();
                    for (int i = 0; i < stealAmount; i++) {
                        int lastIndex = chestContentList.size() - 1;
                        stolen.add(chestContentList.remove(lastIndex));
                        if (chestContentList.size()==0){
                            break;
                        }

                    }
                    Collections.reverse(stolen);
                    System.out.println(String.join(", ", stolen));
                    break;
            }
            input = scanner.nextLine();
        }
        int totalSizeOfLoot = 0;
        int count = 0;
        for (String currentLoot : chestContentList) {
            totalSizeOfLoot += currentLoot.length();
            count++;
        }
        if (totalSizeOfLoot == 0) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", totalSizeOfLoot *1.0 / count);
        }

    }
}


package Lab;

import java.util.*;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> worldSynonyms = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            List<String> currentSynonyms = worldSynonyms.get(word);

            if (currentSynonyms == null) {
                currentSynonyms = new ArrayList<>();
                worldSynonyms.put(word, currentSynonyms);
            }

            currentSynonyms.add(synonym);
        }
        for (Map.Entry<String, List<String>> entry : worldSynonyms.entrySet()) {
            System.out.println(entry.getKey() + " - " + String.join(", ", entry.getValue()));
        }
    }
}

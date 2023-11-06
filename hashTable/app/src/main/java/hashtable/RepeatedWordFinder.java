package hashTable.app.src.main.java.hashtable;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordFinder {

    public static String repeatedWord(String input) {
        String[] words = input.toLowerCase().split("\\W+");

        Map<String, Integer> wordOccurrences = new HashMap<>();

        for (String word : words) {
            if (wordOccurrences.containsKey(word)) {
                return word;
            } else {
                wordOccurrences.put(word, 1);
            }
        }

        throw new RuntimeException("No repeated word found");
    }
}

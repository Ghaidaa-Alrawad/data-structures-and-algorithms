/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashTable.app.src.main.java.hashtable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        testHashtable();
        System.out.println("---");
        testRepeatedWordFinder();
        System.out.println("---");
        testLeftJoin();
    }

    private static void testHashtable() {
        Hashtable<String, Integer> myHashtable = new Hashtable<>();

        myHashtable.set("One", 1);
        myHashtable.set("Two", 2);
        myHashtable.set("Three", 3);
        System.out.println("Hashtable after setting values:\n" + myHashtable);

        System.out.println("Value for key 'Two': " + myHashtable.get("Two"));

        myHashtable.set("Four", 4);
        myHashtable.set("Five", 5);
        System.out.println("Hashtable after handling collisions:\n" + myHashtable);

        System.out.println("Value for key 'Four': " + myHashtable.get("Four"));

        System.out.println("List of keys: " + myHashtable.keys());

        System.out.println("Has key 'Three'? " + myHashtable.has("Three"));
        System.out.println("Has key 'Six'? " + myHashtable.has("Six"));

        try {
            System.out.println("Value for key 'Seven': " + myHashtable.get("Seven"));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void testRepeatedWordFinder() {
        String input1 = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom...";
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs...";
        String input4 = "This is a test sentence with no repeated words.";

        try {
            System.out.println("Repeated word in input1: " + RepeatedWordFinder.repeatedWord(input1));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Repeated word in input2: " + RepeatedWordFinder.repeatedWord(input2));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Repeated word in input3: " + RepeatedWordFinder.repeatedWord(input3));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            System.out.println("Repeated word in input4: " + RepeatedWordFinder.repeatedWord(input4));
        } catch (RuntimeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    private static void testLeftJoin() {
        Map<String, String> synonyms = new HashMap<>();
        synonyms.put("diligent", "employed");
        synonyms.put("fond", "enamored");
        synonyms.put("guide", "usher");
        synonyms.put("outfit", "garb");
        synonyms.put("wrath", "anger");

        Map<String, String> antonyms = new HashMap<>();
        antonyms.put("diligent", "idle");
        antonyms.put("fond", "averse");
        antonyms.put("guide", "follow");
        antonyms.put("flow", "jam");
        antonyms.put("wrath", "delight");

        List<List<String>> result = LeftJoin.leftJoin(synonyms, antonyms);

        for (List<String> row : result) {
            System.out.println(row);
        }
    }
}

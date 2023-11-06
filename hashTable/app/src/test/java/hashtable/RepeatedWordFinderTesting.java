package hashTable.app.src.test.java.hashtable;

import hashTable.app.src.main.java.hashtable.RepeatedWordFinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RepeatedWordFinderTesting {

    @Test
    public void testRepeatedWordFinder() {
        String input1 = "Once upon a time, there was a brave princess who...";
        String input2 = "It was the best of times, it was the worst of times, it was the age of wisdom...";
        String input3 = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs...";

        assertEquals("a", RepeatedWordFinder.repeatedWord(input1));
        assertEquals("it", RepeatedWordFinder.repeatedWord(input2));
        assertEquals("summer", RepeatedWordFinder.repeatedWord(input3));
    }

    @Test
    public void testRepeatedWordFinderNoRepeats() {
        String input = "This is a test sentence with no repeated words.";

        assertThrows(RuntimeException.class, () -> RepeatedWordFinder.repeatedWord(input));
    }
}

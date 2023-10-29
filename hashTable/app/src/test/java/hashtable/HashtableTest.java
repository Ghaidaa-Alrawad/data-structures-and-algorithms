package hashTable.app.src.test.java.hashtable;

import hashTable.app.src.main.java.hashtable.Hashtable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HashtableTest {

    @Test
    void testHashtableFunctionality() {
        Hashtable<String, Integer> myHashtable = new Hashtable<>();

        myHashtable.set("One", 1);
        myHashtable.set("Two", 2);
        myHashtable.set("Three", 3);

        assertEquals(1, myHashtable.get("One"));
        assertEquals(2, myHashtable.get("Two"));
        assertEquals(3, myHashtable.get("Three"));

        myHashtable.set("Four", 4);
        myHashtable.set("Five", 5);

        assertEquals(4, myHashtable.get("Four"));

        assertTrue(myHashtable.keys().contains("One"));
        assertTrue(myHashtable.keys().contains("Two"));
        assertTrue(myHashtable.keys().contains("Three"));
        assertTrue(myHashtable.keys().contains("Four"));
        assertTrue(myHashtable.keys().contains("Five"));

        assertTrue(myHashtable.has("Three"));
        assertFalse(myHashtable.has("Six"));

        assertThrows(RuntimeException.class, () -> myHashtable.get("Seven"));
    }
}

package linkedlist;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    @Test
    void testEmptyLinkedList() {
        LinkedList list = new LinkedList();
        assertTrue(list.toString().equals("NULL"));
    }

    @Test
    void testInsertIntoLinkedList() {
        LinkedList list = new LinkedList();
        list.insert(5);
//        System.out.println("Testing insertion into linked list...");
        assertEquals(list.toString(), "{ 5 } -> NULL");
    }

    @Test
    void testHeadPointsToFirstNode() {
        LinkedList list = new LinkedList();
        list.insert(10);
        assertEquals(list.head.value, 10);
    }

    @Test
    void testInsertMultipleNodes() {
        LinkedList list = new LinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        assertEquals(list.toString(), "{ 1 } -> { 2 } -> { 3 } -> NULL");
    }

    @Test
    void testValueExistsInList() {
        LinkedList list = new LinkedList();
        list.insert(7);
        list.insert(6);
        list.insert(5);
        assertTrue(list.includes(6));
    }

    @Test
    void testValueDoesNotExistInList() {
        LinkedList list = new LinkedList();
        list.insert(9);
        list.insert(8);
        list.insert(7);
        assertFalse(list.includes(5));
    }

    @Test
    void testCollectionOfAllValues() {
        LinkedList list = new LinkedList();
        list.insert(4);
        list.insert(3);
        list.insert(2);
        assertEquals(list.toString(), "{ 2 } -> { 3 } -> { 4 } -> NULL");
    }
}

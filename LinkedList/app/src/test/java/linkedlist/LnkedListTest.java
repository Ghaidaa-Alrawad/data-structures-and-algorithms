package LinkedList.app.src.test.java.linkedlist;
import LinkedList.app.src.main.java.linkedlist.SinglyLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LnkedListTest {
    @Test
    void testEmptyLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();
        assertTrue(list.toString().equals("NULL"));
    }

    @Test
    void testInsertIntoLinkedList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(5);
//        System.out.println("Testing insertion into linked list...");
        assertEquals(list.toString(), "{ 5 } -> NULL");
    }

    @Test
    void testHeadPointsToFirstNode() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        assertEquals(list.head.value, 10);
    }

    @Test
    void testInsertMultipleNodes() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(3);
        list.insert(2);
        list.insert(1);
        assertEquals(list.toString(), "{ 1 } -> { 2 } -> { 3 } -> NULL");
    }
}

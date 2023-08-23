package LinkedList.app.src.test.java.list;
import LinkedList.app.src.main.java.list.SinglyLinkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SinglyLinkedListTest {
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

    //challenge 06

    @Test
    public void testAppend() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> NULL", list.toString());
    }

    @Test
    public void testInsertBefore() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(3);
        list.insert(1);
        list.insertBefore(3, 2);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> NULL", list.toString());
    }

    @Test
    public void testInsertAfter() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(3);
        list.insert(1);
        list.insertAfter(1, 2);
        assertEquals("{ 1 } -> { 2 } -> { 3 } -> NULL", list.toString());
    }

    //challenge 07
    @Test
    void testKthFromEnd() {
        // Test 1: kthFromEnd where k is greater than the length of the linked list
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.append(1);
        assertThrows(IllegalArgumentException.class, () -> list1.kthFromEnd(1));

        // Test 2: kthFromEnd where k and the length of the list are the same
        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.append(1);
        assertThrows(IllegalArgumentException.class, () -> list2.kthFromEnd(1));

        // Test 3: kthFromEnd where k is not a positive integer
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.append(1);
        assertThrows(IllegalArgumentException.class, () -> list3.kthFromEnd(-1));

        // Test 4: kthFromEnd on a list with a size 1
        SinglyLinkedList list4 = new SinglyLinkedList();
        list4.append(5);
        assertEquals(5, list4.kthFromEnd(0));

        // Test 5: Happy Path - kthFromEnd somewhere in the middle of the linked list
        SinglyLinkedList list5 = new SinglyLinkedList();
        list5.append(1);
        list5.append(3);
        list5.append(8);
        list5.append(2);
        assertEquals(3, list5.kthFromEnd(2));

        // Test 6: kthFromEnd at the end of the linked list
        SinglyLinkedList list6 = new SinglyLinkedList();
        list6.append(2);
        list6.append(4);
        list6.append(6);
        list6.append(8);
        assertEquals(8, list6.kthFromEnd(0));
    }
}

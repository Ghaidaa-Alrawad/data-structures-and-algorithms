package LinkedList.app.src.main.java.list;

import java.util.LinkedList;
import java.util.Stack;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
    }

    public boolean includes(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // challenge 06
    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertBefore(int targetValue, int newValue) {
        Node newNode = new Node(newValue);
        if (head == null) {
            // List is empty, cannot insert before any value
            return;
        }
        if (head.value == targetValue) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null && current.next.value != targetValue) {
            current = current.next;
        }
        if (current.next != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void insertAfter(int targetValue, int newValue) {
        Node newNode = new Node(newValue);
        Node current = head;
        while (current != null && current.value != targetValue) {
            current = current.next;
        }
        if (current != null) {
            newNode.next = current.next;
            current.next = newNode;
        }
    }

//     challenge 07
    public int kthFromEnd(int k) {
        if (k < 0) {
            throw new IllegalArgumentException("k must be a non-negative integer");
        }

        Node fast = head;
        Node slow = head;

        // Move the fast pointer k+1 steps ahead
        for (int i = 0; i <= k; i++) {
            if (fast == null) {
                throw new IllegalArgumentException("k is greater than the length of the linked list");
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if (slow == null) {
            throw new IllegalArgumentException("k is greater than the length of the linked list");
        }

        return slow.value;
    }

//    challenge 08
    public SinglyLinkedList zipLists(SinglyLinkedList li1, SinglyLinkedList li2){
        SinglyLinkedList zippedList = new SinglyLinkedList();

        Node current1 = li1.head;
        Node current2 = li2.head;

        while (current1 != null && current2 != null){
            zippedList.append(current1.value);
            zippedList.append(current2.value);

            current1 = current1.next;
            current2 = current2.next;
        }

        while (current1 != null){
            zippedList.append(current1.value);

            current1 = current1.next;
        }

        while (current2 != null){
            zippedList.append(current2.value);

            current2 = current2.next;
        }

        return zippedList;
    }

    // Challenge 09
    public boolean isPalindrome() {
        if (head == null) {
            return true;
        }

        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next != null) {
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            if (slow.value != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }

        return true;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append("{ ").append(current.value).append(" } -> ");
            current = current.next;
        }
        result.append("NULL");
        return result.toString();
    }


}

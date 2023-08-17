package LinkedList.app.src.main.java.linkedlist;

public class LnkedList {
    public Node head;

    public LnkedList() {
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

    public static void main(String[] args) {
        LnkedList linkedList = new LnkedList();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println("Linked List: " + linkedList.toString());

        System.out.println("Includes 2: " + linkedList.includes(2));
        System.out.println("Includes 50: " + linkedList.includes(50));
    }
}

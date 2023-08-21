/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList.app.src.main.java.linkedlist;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println("Linked List: " + linkedList.toString());

        System.out.println("Includes 2: " + linkedList.includes(2));
        System.out.println("Includes 50: " + linkedList.includes(50));
    }

}

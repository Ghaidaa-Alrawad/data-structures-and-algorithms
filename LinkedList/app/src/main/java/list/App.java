/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package LinkedList.app.src.main.java.list;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        System.out.println("Linked List: " + linkedList.toString());

        System.out.println("Includes 2: " + linkedList.includes(2));
        System.out.println("Includes 50: " + linkedList.includes(50));

        System.out.println("---");
        System.out.println("challenge 06 start: ");
        System.out.println();

        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(3);
        list.insert(2);
        list.insert(1);

        System.out.println("Original list:");
        System.out.println(list);

        System.out.println();

        list.append(4);
        System.out.println("After append:");
        System.out.println(list);

        System.out.println();

        list.insertBefore(3, 6);
        System.out.println("After insertBefore:");
        System.out.println(list);

        System.out.println();

        list.insertAfter(3, 7);
        System.out.println("After insertAfter:");
        System.out.println(list);


        System.out.println("---");
        System.out.println("challenge 07 start: ");

        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(8);
        list1.append(2);

        try {
            System.out.println(list1.kthFromEnd(0)); // Output should be 2
            System.out.println(list1.kthFromEnd(2)); // Output should be 3
             System.out.println(list1.kthFromEnd(6)); // This will throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error Message: "+e.getMessage());
        }
    }
}



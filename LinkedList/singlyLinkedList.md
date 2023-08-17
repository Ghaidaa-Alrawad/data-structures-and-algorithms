# Linked Lists (Singly Linked List)

---

## Description of the challenge

The challenge is to implement a singly linked list data structure in Java, consisting of two classes: LinkedList and Node. The LinkedList class is responsible for managing the linked list operations, including insertion and search, while the Node class defines the individual elements of the linked list.

---

## Whiteboard

#### Whiteboard pic

![](img/CC%20(5).jpg)

##### better quality 

![](img/CC%20(6).jpg)

![](img/CC%20(7).jpg)

---

## Approach & Efficiency

1. Insertion:
- Approach: The insert method in the LinkedList class adds a new node to the beginning of the linked list. It creates a new node, assigns the new node's next pointer to the current head, and updates the head to point to the new node.
- Efficiency: This approach is very efficient, with a constant time complexity of O(1). Inserting at the beginning of the linked list does not depend on the list's size and is a constant-time operation.

2. Search (Includes):
- Approach: The includes method in the LinkedList class iterates through the linked list by traversing each node from the head to the end. It checks if the value in the current node matches the target value and returns true if found, otherwise, it continues until the end of the list.
- Efficiency: In the worst case, where the target value is not present or is the last element, the includes operation needs to traverse the entire linked list. As a result, the time complexity is linear, O(n), where n is the number of nodes in the list.

3. ToString:
- Approach: The toString method in the LinkedList class generates a string representation of the linked list by iterating through each node from the head to the end. It appends each node's value to the result string along with the "->" symbol, and ends with "NULL".
- Efficiency: Since the method needs to traverse through every node to build the string representation, the time complexity is linear, O(n), where n is the number of nodes in the list

---

## Solution

### Code

#### Node 

```java
public class Node {

    public int value;
    public Node next;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
```

#### linkedList 

```java
public class LinkedList {
    public Node head;

    public LinkedList() {
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
}
```
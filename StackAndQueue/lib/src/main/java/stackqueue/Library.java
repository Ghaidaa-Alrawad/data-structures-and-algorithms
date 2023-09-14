/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package StackAndQueue.lib.src.main.java.stackqueue;

import StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel.Animal;
import StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel.AnimalShelter;
import StackAndQueue.lib.src.main.java.stackqueue.queue.DuckDuckGoose;
import StackAndQueue.lib.src.main.java.stackqueue.queue.PseudoQueue;
import StackAndQueue.lib.src.main.java.stackqueue.queue.Queue;
import StackAndQueue.lib.src.main.java.stackqueue.stack.Stack;
import StackAndQueue.lib.src.main.java.stackqueue.stack.ValidBrackets;

public class Library {
    public static void main(String[] args) {
        Queue<Integer> q1 = new Queue<>();

        System.out.println("Queue: ");
        // testing the isEmpty method
        System.out.println("Is the queue list is empty??  " + q1.isEmpty());

        // testing peek on an empty queue
        q1.peek();

        // testing enqueue
        q1.enqueue(1);
        q1.enqueue(2);
        q1.enqueue(3);

        System.out.println("Queue after enqueue some numbers :");
        System.out.println(q1);

        // testing dequeue
        // here the queue FIFO, the first number will be removed which is 1
        q1.dequeue();

        System.out.println("Queue after dequeue :");
        System.out.println(q1);

        // testing peek
        System.out.println("now you can Peek: " + q1.peek());

        // here the output should not be empty now
        System.out.println("Is the queue list is empty??  " + q1.isEmpty());

        System.out.println("---");

        System.out.println("Stack :");

        Stack<Integer> s1 = new Stack<>();
        // testing the isEmpty method
        System.out.println("Is the stack list is empty??  " + s1.isEmpty());

        // testing peek on an empty stack
        s1.peek();

        // testing push
        s1.push(4);
        s1.push(5);
        s1.push(6);

        System.out.println("Stack after push some numbers :");
        System.out.println(s1);

        // testing pop
        // here the stack LIFO, the first number will be removed which is 6, 6 will be at fist cuz the push is happening in the top of the list
        s1.pop();

        System.out.println("Stack after the pop :");
        System.out.println(s1);

        // testing peek
        System.out.println("Peek : " + s1.peek());

        // here the output should not be empty now
        System.out.println("Is the satck list is empty??  " + s1.isEmpty());

        // PseudoQueue Challenge
        System.out.println("---");
        System.out.println("PseudoQueue Challenge: ");
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        // Enqueue some elements
        pseudoQueue.enqueue(20);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(5);

        // Print the initial queue
        System.out.println("Queue Before: " + pseudoQueue.toString());

        // Dequeue an element
        int dequeuedValue = pseudoQueue.dequeue();
        System.out.println("Dequeued Value: " + dequeuedValue);

        // Print the updated queue
        System.out.println("Queue After 1 : " + pseudoQueue.toString());

        int dequeuedValue2 = pseudoQueue.dequeue();
        System.out.println("Dequeued Value: " + dequeuedValue2);

        System.out.println("Queue After 2 : " + pseudoQueue.toString());



        System.out.println("---");
        System.out.println("Animal Shelter Challenge :");

        AnimalShelter shelter = new AnimalShelter();

        shelter.enqueue(new Animal("cat", "Farhoud"));
        shelter.enqueue(new Animal("dog", "Doggy"));
        shelter.enqueue(new Animal("cat", "Mesh Mesh"));

        // animal shelter contents
        System.out.println(shelter);

        // dequeue dog
        System.out.println("Here will dequeue the dog and his name is: " + shelter.dequeue("dog").getName());

        System.out.println("Here will dequeue the oldest cat and his name is: " + shelter.dequeue("cat").getName());

        System.out.println("---");
        System.out.println("Valid Bracket Challenge :");

        ValidBrackets valid1 = new ValidBrackets();
        System.out.println("input :{[()]} , "+ valid1.validBracket("{[()]}")); // should be true

        ValidBrackets valid2 = new ValidBrackets();
        System.out.println("input :[({}] , "+valid2.validBracket("[({}]")); // should be false

    }
}

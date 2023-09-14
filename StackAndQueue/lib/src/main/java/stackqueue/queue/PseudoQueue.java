package StackAndQueue.lib.src.main.java.stackqueue.queue;

import StackAndQueue.lib.src.main.java.stackqueue.stack.Stack;

public class PseudoQueue<T> {
    public Stack<T> stack1;
    public Stack<T> stack2;

    public PseudoQueue() {
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enqueue(T value) {
        stack1.push(value);
    }

    public T dequeue() {
        if (!stack1.isEmpty()){
            return stack1.pop();
        }else return null;
    }



    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString(){
        return stack1.toString();
    }

    public static void main(String[] args) {
        PseudoQueue<Integer> pseudoQueue = new PseudoQueue<>();

        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(10);
        pseudoQueue.enqueue(15);
        pseudoQueue.enqueue(20);
        System.out.println(pseudoQueue);

        int dequeuedValue1 = pseudoQueue.dequeue();
        System.out.println("Dequeued: " + dequeuedValue1);
        System.out.println(pseudoQueue);

        int dequeuedValue2 = pseudoQueue.dequeue();
        System.out.println("Dequeued: " + dequeuedValue2);
        System.out.println(pseudoQueue);
    }

}
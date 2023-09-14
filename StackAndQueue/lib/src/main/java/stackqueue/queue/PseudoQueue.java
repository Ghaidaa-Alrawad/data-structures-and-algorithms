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
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push((T) stack1.pop());
            }
        }

        return stack2.pop();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "PseudoQueue is empty.";
        }

        StringBuilder sb = new StringBuilder();

        Stack<T> tempStack = new Stack<>();
        while (!stack2.isEmpty()) {
            tempStack.push(stack2.pop());
        }
        while (!tempStack.isEmpty()) {
            T value = tempStack.pop();
            sb.append(value).append(" ");
            stack2.push(value);
        }

        while (!stack1.isEmpty()) {
            T value = stack1.pop();
            sb.append(value).append(" ");
            stack2.push(value);
        }

        return sb.toString().trim();
    }


}
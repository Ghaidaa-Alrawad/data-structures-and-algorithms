package StackAndQueue.lib.src.main.java.stackqueue.stack;

public class Stack<T> {
    private Node<T> top;

    public Stack(){
        top = null;
    }

    public void push(T value){
        Node<T> newNode = new Node<>(value);
        newNode.next = top;
        top = newNode;
    }

    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty, can't pop");
        }

        T value = top.value;
        top = top.next;
        return value;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is empty, there is to peek");
            return null;
        }
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }


    @Override
    public String toString() {
        if (isEmpty()){
            return "stack is empty";
        }

        StringBuilder stack = new StringBuilder("top -> ");
        Node<T> current = top;
        while (current != null){
            stack.append("{").append(current.value).append("}").append(" -> ");
            current = current.next;
        }
        stack.setLength(stack.length() - 3);
        return stack.toString();
    }
}

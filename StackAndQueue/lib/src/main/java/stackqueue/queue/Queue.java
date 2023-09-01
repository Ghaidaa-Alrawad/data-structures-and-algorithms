package StackAndQueue.lib.src.main.java.stackqueue.queue;

public class Queue<T> {
    private Node<T> front;
    private Node<T> temp;

    public Queue(){
        front = null;
        temp = null;
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<>(value, null);
        if (isEmpty()){
            front = newNode;
            temp = newNode;
        }else {
            temp.next = newNode;
            temp = newNode;
        }
    }

    public T dequeue(){

        if (isEmpty()){
            System.out.println("Queue is empty, can't dequeue");
        }

        T value = front.value;
        front = front.next;
        return value;
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Queue is empty, there is nothing to peek");
            return null;
        }
        return front.value;
    }

    public boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
       if (isEmpty()){
           return "queue is empty";
       }

       StringBuilder queue = new StringBuilder("front -> ");
       Node<T> current = front;
       while (current != null){
           queue.append("{").append(current.value).append("}").append(" -> ");
           current = current.next;
       }

       // in here i will remove the extra ->
       queue.setLength(queue.length() - 3);
       return queue.toString();
    }
}

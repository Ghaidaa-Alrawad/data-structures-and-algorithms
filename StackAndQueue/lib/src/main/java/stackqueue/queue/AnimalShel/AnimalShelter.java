package StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel;

import StackAndQueue.lib.src.main.java.stackqueue.queue.Node;

public class AnimalShelter {
    private Node<Animal> front;
    private Node<Animal> rear;

    public AnimalShelter(){
        front = null;
        rear = null;
    }

    public void enqueue(Animal animal){
        Node<Animal> newNode = new Node<>(animal, null);

        if (rear == null){
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Animal dequeue(String pref){
        if (isEmpty()){
            return null;
        }

        if (pref.equals("dog") || pref.equals("cat")){
            if (front.value.species.equals(pref)){
                Animal adoptedAnimal = front.value;
                front = front.next;
                return adoptedAnimal;
            }else {
                Node<Animal> current = front;
                while (current.next != null && !current.next.value.species.equals(pref)){
                    current = current.next;
                }

                if (current.next != null){
                    Animal adoptedAnimal = current.next.value;
                    current.next = current.next.next;
                    return adoptedAnimal;
                }
            }
        }
        return null;
    }

    private boolean isEmpty(){
        return front == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Animal Shelter is empty";
        }

        StringBuilder shelter = new StringBuilder("Animal Shelter : Front -> ");
        Node<Animal> current = front;
        while (current != null) {
            shelter.append("{").append(current.value).append("}").append(" -> ");

            current = current.next;
        }

        // Removing the extra " -> "
        shelter.setLength(shelter.length() - 4);
        shelter.append(" -> Rear");
        return shelter.toString();
    }
}

package StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel;

public class Animal {

    String species;
    String name;

    public Animal(String species, String name) {
        this.species = species;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return species + ": " + name;
    }
}

package StackAndQueue.lib.src.test.java.stackqueue.queueT;

import StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel.Animal;
import StackAndQueue.lib.src.main.java.stackqueue.queue.AnimalShel.AnimalShelter;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class AnimalShelterTest {
    @Test
    public void testEnqueueAndDequeue() {
        AnimalShelter shelter = new AnimalShelter();
        Animal dog1 = new Animal("dog", "dog1");
        Animal dog2 = new Animal("dog", "dog2");
        shelter.enqueue(dog1);
        shelter.enqueue(dog2);

        Animal adoptedDog = shelter.dequeue("dog");

        assertEquals(dog1, adoptedDog);
    }


}

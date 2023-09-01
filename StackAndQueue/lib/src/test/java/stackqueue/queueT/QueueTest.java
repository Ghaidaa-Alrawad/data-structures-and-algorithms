package StackAndQueue.lib.src.test.java.stackqueue.queueT;

import StackAndQueue.lib.src.main.java.stackqueue.queue.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {

   @Test
    void testingEnqueueAndDequeue(){
       Queue<Integer> queue = new Queue<>();
       queue.enqueue(1);
       queue.enqueue(2);
       queue.enqueue(3);

       assertEquals(1, queue.dequeue());
       assertEquals(2, queue.dequeue());
       assertEquals(3, queue.dequeue());
       assertTrue(queue.isEmpty());
   }

    @Test
    void testPeek() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);

        assertEquals(1, queue.peek());
    }

    @Test
    void testIsEmpty() {
        Queue<Integer> queue = new Queue<>();

        assertTrue(queue.isEmpty());

        queue.enqueue(1);
        assertFalse(queue.isEmpty());

        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    void testToString() {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals("front -> {1} -> {2} -> {3} ", queue.toString());
    }
}

package StackAndQueue.lib.src.test.java.stackqueue.stackT;

import StackAndQueue.lib.src.main.java.stackqueue.stack.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    void testingPushAndPop(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void testPeek(){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);

        assertEquals(2, stack.peek());
    }

    @Test
    void testIsEmpty(){
        Stack<Integer> stack = new Stack<>();

        assertTrue(stack.isEmpty());

        stack.push(1);
        assertFalse(stack.isEmpty());

        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void testToString(){
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals("top -> {3} -> {2} -> {1} ", stack.toString());
    }
}

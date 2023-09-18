package Trees.app.src.test.java.trees;

import Trees.app.src.main.java.trees.BinarySearchTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTreeTest {
    private BinarySearchTree<Integer> bst;

    @BeforeEach
    public void setUp() {
        bst = new BinarySearchTree<>();
    }

    @Test
    public void testAddAndContains() {
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        assertTrue(bst.contains(50));
        assertTrue(bst.contains(30));
        assertTrue(bst.contains(70));
        assertTrue(bst.contains(20));
        assertTrue(bst.contains(40));
        assertTrue(bst.contains(60));
        assertTrue(bst.contains(80));
        assertFalse(bst.contains(10));
        assertFalse(bst.contains(90));
    }

    @Test
    public void testPreOrderTraversal() {
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        List<Integer> expected = Arrays.asList(50, 30, 20, 40, 70, 60, 80);
        List<Integer> result = bst.preOrderTraverse(bst.getRoot(), new ArrayList<>());

        assertEquals(expected, result);
    }

    @Test
    public void testInOrderTraversal() {
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        List<Integer> expected = Arrays.asList(20, 30, 40, 50, 60, 70, 80);
        List<Integer> result = bst.inOrderTraverse(bst.getRoot(), new ArrayList<>());

        assertEquals(expected, result);
    }

    @Test
    public void testPostOrderTraversal() {
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        List<Integer> expected = Arrays.asList(20, 40, 30, 60, 80, 70, 50);
        List<Integer> result = bst.postOrderTraverse(bst.getRoot(), new ArrayList<>());

        assertEquals(expected, result);
    }

    // testing for cc 16
    @Test
    public void testFindMaximumValueWithEmptyTree() {
        try {
            bst.findMaximumValue();
            fail("Expected NullPointerException for an empty tree");
        } catch (NullPointerException e) {
            assertEquals("Tree is Empty", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumValueWithSingleNode() {
        bst.add(42);
        int maxValue = bst.findMaximumValue();
        assertEquals(42, maxValue);
    }

    @Test
    public void testFindMaximumValueWithLeftSubtree() {
        bst.add(50);
        bst.add(30);
        bst.add(20);
        bst.add(40);

        int maxValue = bst.findMaximumValue();
        assertEquals(50, maxValue);
    }

    @Test
    public void testFindMaximumValueWithRightSubtree() {
        bst.add(50);
        bst.add(70);
        bst.add(60);
        bst.add(80);

        int maxValue = bst.findMaximumValue();
        assertEquals(80, maxValue);
    }

    @Test
    public void testFindMaximumValueWithMixedSubtree() {
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        int maxValue = bst.findMaximumValue();
        assertEquals(80, maxValue);
    }
}

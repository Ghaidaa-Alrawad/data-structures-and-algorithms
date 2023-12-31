package Trees.app.src.test.java.trees;

import Trees.app.src.main.java.trees.BinarySearchTree;
import Trees.app.src.main.java.trees.BinaryTree;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    @Test
    public void testInOrderTraversal() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        ArrayList<Integer> result = bst.inOrderTraverse(bst.getRoot(), new ArrayList<>());

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(30);
        expected.add(40);
        expected.add(50);
        expected.add(60);
        expected.add(70);
        expected.add(80);

        assertIterableEquals(expected, result);
    }

    @Test
    public void testPostOrderTraversal() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);

        ArrayList<Integer> result = bst.postOrderTraverse(bst.getRoot(), new ArrayList<>());

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(40);
        expected.add(30);
        expected.add(60);
        expected.add(80);
        expected.add(70);
        expected.add(50);

        assertIterableEquals(expected, result);
    }

    private BinarySearchTree<Integer> tree;

    @BeforeEach
    public void setUp() {
        tree = new BinarySearchTree<>();
    }

    @Test
    public void testBreadthFirstEmptyTree() {
        ArrayList<Integer> result = tree.breadthFirst();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testBreadthFirstSingleNodeTree() {
        tree.add(10);
        ArrayList<Integer> result = tree.breadthFirst();
        assertEquals(1, result.size());
        assertEquals(10, result.get(0));
    }

    @Test
    public void testBreadthFirstMultipleNodeTree() {
        tree.add(10);
        tree.add(5);
        tree.add(15);
        tree.add(3);
        tree.add(7);
        ArrayList<Integer> result = tree.breadthFirst();
        assertEquals(5, result.size());
        assertArrayEquals(new Integer[]{10, 5, 15, 3, 7}, result.toArray());
    }
}

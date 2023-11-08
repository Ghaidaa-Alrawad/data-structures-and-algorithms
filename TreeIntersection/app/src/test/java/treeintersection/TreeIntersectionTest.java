package TreeIntersection.app.src.test.java.treeintersection;

import TreeIntersection.app.src.main.java.treeintersection.Node;
import TreeIntersection.app.src.main.java.treeintersection.TreeIntersection;

import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TreeIntersectionTest {

    @Test
    void testTreeIntersection() {
        Node tree1 = new Node(1);
        tree1.left = new Node(2);
        tree1.right = new Node(3);
        tree1.left.left = new Node(4);
        tree1.left.right = new Node(5);

        Node tree2 = new Node(2);
        tree2.left = new Node(4);
        tree2.right = new Node(6);
        tree2.left.left = new Node(8);
        tree2.left.right = new Node(5);

        HashSet<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(2);
        expectedIntersection.add(4);
        expectedIntersection.add(5);

        HashSet<Integer> actualIntersection = TreeIntersection.treeIntersection(tree1, tree2);
        assertEquals(expectedIntersection, actualIntersection);
    }

    @Test
    void testPopulateHashSet() {
        Node tree = new Node(1);
        tree.left = new Node(2);
        tree.right = new Node(3);
        tree.left.left = new Node(4);
        tree.left.right = new Node(5);

        HashSet<Integer> expectedHashSet = new HashSet<>();
        expectedHashSet.add(1);
        expectedHashSet.add(2);
        expectedHashSet.add(3);
        expectedHashSet.add(4);
        expectedHashSet.add(5);

        HashSet<Integer> actualHashSet = new HashSet<>();
        TreeIntersection.populateHashSet(tree, actualHashSet);
        assertEquals(expectedHashSet, actualHashSet);
    }

    @Test
    void testFindIntersection() {
        Node tree = new Node(2);
        tree.left = new Node(4);
        tree.right = new Node(6);
        tree.left.left = new Node(8);
        tree.left.right = new Node(5);

        HashSet<Integer> valuesInTree = new HashSet<>();
        valuesInTree.add(1);
        valuesInTree.add(2);
        valuesInTree.add(3);
        valuesInTree.add(4);
        valuesInTree.add(5);

        HashSet<Integer> expectedIntersection = new HashSet<>();
        expectedIntersection.add(2);
        expectedIntersection.add(4);
        expectedIntersection.add(5);

        HashSet<Integer> actualIntersection = new HashSet<>();
        TreeIntersection.findIntersection(tree, valuesInTree, actualIntersection);
        assertEquals(expectedIntersection, actualIntersection);
    }
}

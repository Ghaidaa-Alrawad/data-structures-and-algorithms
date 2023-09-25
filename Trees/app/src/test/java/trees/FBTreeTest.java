package Trees.app.src.test.java.trees;

import Trees.app.src.main.java.trees.KTree.FBTree;
import Trees.app.src.main.java.trees.KTree.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FBTreeTest {

    @Test
    public void testFizzBuzzTree() {
        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> child1 = new TreeNode<>(3);
        TreeNode<Integer> child2 = new TreeNode<>(5);
        TreeNode<Integer> child3 = new TreeNode<>(2);

        root.getChildren().add(child1);
        root.getChildren().add(child2);
        root.getChildren().add(child3);

        TreeNode<Integer> grandChild1 = new TreeNode<>(30);
        TreeNode<Integer> grandChild2 = new TreeNode<>(20);

        child1.getChildren().add(grandChild1);
        child3.getChildren().add(grandChild2);

        FBTree<Integer> originalTree = new FBTree<>(root.getValue());
        originalTree.getRoot().getChildren().addAll(root.getChildren());


        FBTree<String> fizzBuzzTree = new FBTree<>("FizzBuzz");
        for (TreeNode<Integer> child : originalTree.getRoot().getChildren()) {
            TreeNode<String> fizzBuzzChild = fizzBuzzTree.fizzBuzTree(child);
            fizzBuzzTree.getRoot().getChildren().add(fizzBuzzChild);
        }

        TreeNode<String> fizzBuzzRoot = fizzBuzzTree.getRoot();
        assertEquals("FizzBuzz", fizzBuzzRoot.getValue());
        assertEquals("Fizz", fizzBuzzRoot.getChildren().get(0).getValue());
        assertEquals("Buzz", fizzBuzzRoot.getChildren().get(1).getValue());
        assertEquals("2", fizzBuzzRoot.getChildren().get(2).getValue());
        assertEquals("FizzBuzz", fizzBuzzRoot.getChildren().get(0).getChildren().get(0).getValue());
    }
    @Test
    public void testEmptyTree() {
        FBTree<Integer> emptyTree = new FBTree<>(0);

        FBTree<String> fizzBuzzTree = new FBTree<>("FizzBuzz");
        fizzBuzzTree.fizzBuzTree(emptyTree.getRoot());

        TreeNode<String> fizzBuzzRoot = fizzBuzzTree.getRoot();
        assertEquals(0, fizzBuzzRoot.getChildren().size());
    }
}

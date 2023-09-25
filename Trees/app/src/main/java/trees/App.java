/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Trees.app.src.main.java.trees;

import Trees.app.src.main.java.trees.KTree.FBTree;
import Trees.app.src.main.java.trees.KTree.TreeNode;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        BinarySearchTree<Integer> b1 = new BinarySearchTree<>();

        b1.add(50);
        b1.add(30);
        b1.add(70);
        b1.add(20);
        b1.add(40);
        b1.add(60);
        b1.add(80);

        System.out.println("Contains 40: " + b1.contains(40)); // true
        System.out.println("Contains 12354: " + b1.contains(12354)); // false

        ArrayList<Integer> preOrderResult = b1.preOrderTraverse(b1.getRoot(), new ArrayList<>());
        System.out.println("Preorder Traversal: " + preOrderResult);

        ArrayList<Integer> inOrderResult = b1.inOrderTraverse(b1.getRoot(), new ArrayList<>());
        System.out.println("Inorder Traversal: " + inOrderResult);

        ArrayList<Integer> postOrderResult = b1.postOrderTraverse(b1.getRoot(), new ArrayList<>());
        System.out.println("Postorder Traversal: " + postOrderResult);

        System.out.println("---");
        System.out.println("MAX Coding challenge");

        int maxValue = b1.findMaximumValue();
        System.out.println("Maximum value in the tree: " + maxValue);

        System.out.println("---");
        System.out.println("Breadth First challenge");

        System.out.println(b1.breadthFirst());

        System.out.println("---");
        System.out.println("Fizz Buzz challenge");

        TreeNode<Integer> root = new TreeNode<>(15);
        TreeNode<Integer> child1 = new TreeNode<>(5);
        TreeNode<Integer> child2 = new TreeNode<>(3);
        TreeNode<Integer> child3 = new TreeNode<>(9);

        TreeNode<Integer> grandChild1 = new TreeNode<>(2);
        TreeNode<Integer> grandChild2 = new TreeNode<>(4);

        root.getChildren().add(child1);
        root.getChildren().add(child2);
        root.getChildren().add(child3);

        child1.getChildren().add(grandChild1);
        child3.getChildren().add(grandChild2);

        FBTree<Integer> originalTree = new FBTree<>(root.getValue());
        originalTree.getRoot().getChildren().addAll(root.getChildren());

        FBTree<String> fizzBuzzTree = new FBTree<>("Fizz Buzz Tree");

        TreeNode<String> fizzBuzzRoot = fizzBuzzTree.fizzBuzTree(originalTree.getRoot());

        // print the Fizz Buzz tree, okay in here well se that 2 and 4 is not changed cuz they are not %5 or %3 == 0
        fizzBuzzTree.printFizzBuzzTree(fizzBuzzRoot);
    }
}
package Trees.app.src.main.java.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree<T extends Comparable<T>> {
    Node<T> root;

    public BinaryTree(){
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }

    public ArrayList<T> preOrderTraverse(Node<T> newNode, ArrayList<T> tArrayList) {

        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        if (newNode != null) {
            tArrayList.add(newNode.value);
            preOrderTraverse(newNode.left, tArrayList);
            preOrderTraverse(newNode.right, tArrayList);
        }

        return tArrayList;
    }

    public ArrayList<T> inOrderTraverse(Node<T> newNode,ArrayList<T> tArrayList) {

        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        if (newNode != null) {
            inOrderTraverse(newNode.left,tArrayList);
            tArrayList.add(newNode.value);
            inOrderTraverse(newNode.right,tArrayList);
        }

        return tArrayList;
    }

    public ArrayList<T> postOrderTraverse(Node<T> newNode,ArrayList<T> tArrayList) {

        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        if (newNode != null) {
            postOrderTraverse(newNode.left,tArrayList);
            postOrderTraverse(newNode.right,tArrayList);
            tArrayList.add(newNode.value);
        }

        return tArrayList;
    }

    public T findMaximumValue() {
        if (root == null) {
            throw new NullPointerException("Tree is Empty");
        }

        return findMaximumValue(root);
    }

    private T findMaximumValue(Node<T> current) {
        if (current.right != null) {
            return findMaximumValue(current.right);
        }

        return current.value;
    }

    public ArrayList<T> breadthFirst(){

        ArrayList<T> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node<T> currentNode = queue.poll();
            result.add(currentNode.value);

            if (currentNode.left != null){
                queue.add(currentNode.left);
            }

            if (currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
        return result;
    }
}

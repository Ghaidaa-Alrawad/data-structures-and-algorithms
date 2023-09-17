package Trees.app.src.main.java.trees;

public class BinarySearchTree <T extends Comparable<T>> extends BinaryTree<T>{

    public BinarySearchTree(){
        super();
    }

    public void add(T value) {
        root = addHelper(root, value);
    }

    private Node<T> addHelper(Node<T> current, T value) {
        if (current == null) {
            return new Node<>(value);
        }

        if (value.compareTo(current.value) < 0) {
            current.left = addHelper(current.left, value);
        } else if (value.compareTo(current.value) > 0) {
            current.right = addHelper(current.right, value);
        }

        return current;
    }

    public boolean contains(T value) {
        return containsHelper(root, value);
    }

    private boolean containsHelper(Node<T> current, T value) {
        if (current == null) {
            return false;
        }

        if (value.equals(current.value)) {
            return true;
        }

        if (value.compareTo(current.value) < 0) {
            return containsHelper(current.left, value);
        } else {
            return containsHelper(current.right, value);
        }
    }
}

package Trees.app.src.main.java.trees.KTree;

public class FBTree<T> {
    private TreeNode<T> root;

    public FBTree(T root) {
        this.root = new TreeNode<>(root);
    }

    public TreeNode<T> getRoot() {
        return root;
    }

    public TreeNode<String> fizzBuzTree(TreeNode<Integer> node) {
        if (node == null) return null;
        TreeNode<String> fizzBuzzNode = new TreeNode<>(fizzBuz(node.value));
        for (TreeNode<Integer> child : node.getChildren()
        ) {
            fizzBuzzNode.getChildren().add(fizzBuzTree(child));
        }
        return fizzBuzzNode;
    }

    private String fizzBuz(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        } else return String.valueOf(value);
    }

    public void printFizzBuzzTree(TreeNode<String> node) {
        if (node == null) return;
        System.out.print(node.getValue() + " ");
        for (TreeNode<String> child : node.getChildren()) {
            printFizzBuzzTree(child);
        }
    }
}

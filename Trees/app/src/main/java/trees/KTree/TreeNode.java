package Trees.app.src.main.java.trees.KTree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode<T> {
    T value;
    List<TreeNode<T>> children;

    public TreeNode(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public List<TreeNode<T>> getChildren() {
        return children;
    }
}

package Trees.app.src.main.java.trees.dirFileComparator;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    String name;
    List<TreeNode> children;

    public TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

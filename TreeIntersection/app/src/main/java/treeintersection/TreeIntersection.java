package TreeIntersection.app.src.main.java.treeintersection;

import java.util.HashSet;

public class TreeIntersection {
    public static HashSet<Integer> treeIntersection(Node tree1, Node tree2) {
        HashSet<Integer> result = new HashSet<>();
        HashSet<Integer> valuesInTree1 = new HashSet<>();

        populateHashSet(tree1, valuesInTree1);
        findIntersection(tree2, valuesInTree1, result);

        return result;
    }

    public static void populateHashSet(Node node, HashSet<Integer> values) {
        if (node != null) {
            values.add(node.val);
            populateHashSet(node.left, values);
            populateHashSet(node.right, values);
        }
    }

    public static void findIntersection(Node node, HashSet<Integer> values, HashSet<Integer> result) {
        if (node != null) {
            if (values.contains(node.val)) {
                result.add(node.val);
            }
            findIntersection(node.left, values, result);
            findIntersection(node.right, values, result);
        }
    }
}

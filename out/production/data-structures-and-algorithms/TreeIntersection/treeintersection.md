# Tree Intersection

Finding the intersection of values between two binary trees.

---

## Whiteboard

![](img/CC%20(1).jpg)

---

## Approach & Efficiency

The approach is to use HashSet for efficient lookup of values. 
The efficiency is reasonable, especially for sparse trees where the intersection is likely to be smaller. 
The algorithm could be optimized further based on specific characteristics of the trees, but overall it's a reasonable and readable solution.

- Time Complexity: O(N + M), where N is the number of nodes in tree1 and M is the number of nodes in tree2. The algorithm visits each node in both trees.
- Space Complexity: O(N), where N is the number of nodes in tree1. The space is used to store values from tree1 in a HashSet.

---

## Solution


```java
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
```
# Breadth First Challenge 36

The problem is to traverse a graph using breadth-first search starting from a given node and return the visited nodes in the order they were encountered.

---

## Whiteboard

![CC36.jpg](img%2FCC36.jpg)

---

## Approach & Efficiency

- The approach is to use a breadth-first search algorithm to traverse the graph.
- It efficiently explores the graph level by level, ensuring the minimum number of steps to reach each node.
- The algorithm is efficient for both connected and disconnected graphs. The time complexity is linear in the size of the graph, making it a practical approach for various scenarios.

- Time Complexity: O(V + E), where V is the number of vertices and E is the number of edges in the graph.
- Space Complexity: O(V), as the space required for the visited set and the queue.

---

## Solution

[Graph.java](app%2Fsrc%2Fmain%2Fjava%2Fgraphs%2FGraph.java)

```java
public class Graph {
    public Collection<Integer> breadthFirst(Node startNode) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startNode.getValue());
        visited.add(startNode.getValue());

        while (!queue.isEmpty()) {
        int currentVertex = queue.poll();
        result.add(currentVertex);

        for (Edge edge : getNeighbors(currentVertex)) {
        int neighborVertex = edge.targetVertex;
        if (!visited.contains(neighborVertex)) {
        queue.add(neighborVertex);
        visited.add(neighborVertex);
        }
        }
        }

        System.out.println("Breadth-First Traversal Result: " + result);
        return result;
    }
}
```
# Depth First

perform a depth-first traversal on a graph starting from a given node and return a collection of nodes in their pre-order depth-first traversal order.

---

## Whiteboard

![CC38.jpg](img%2FCC38.jpg)

---

## Approach & Efficiency

- The algorithm uses a recursive approach for simplicity.
- It efficiently explores all vertices and their edges, avoiding revisiting already visited nodes.
- The time and space complexities are reasonable for typical graph sizes, but the recursive nature could lead to a stack overflow for very large graphs. Consider using an iterative approach with an explicit stack for such cases.


- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

---

## Solution

[Graph.java](app%2Fsrc%2Fmain%2Fjava%2Fgraphs%2FGraph.java)

```java
public class Graph {
    public Collection<Integer> depthFirst(Node startNode) {
        Set<Integer> visited = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        depthFirstHelper(startNode.getValue(), visited, result);

        System.out.println("Depth-First Traversal Result: " + result);
        return result;
    }

    private void depthFirstHelper(int currentVertex, Set<Integer> visited, List<Integer> result) {
        visited.add(currentVertex);
        result.add(currentVertex);

        for (Edge edge : getNeighbors(currentVertex)) {
            int neighborVertex = edge.targetVertex;
            if (!visited.contains(neighborVertex)) {
                depthFirstHelper(neighborVertex, visited, result);
            }
        }
    }
}
```
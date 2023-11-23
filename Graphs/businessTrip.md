# Business Trip

determine the cost of a business trip between cities represented as vertices in a graph. The cost is calculated based on direct flights between cities, and the method should handle cases where the provided route is valid or invalid.

---

## Whiteboard

![CC37.jpg](img%2FCC37.jpg)

---

## Approach & Efficiency

The approach is straightforward. The method iterates through the given route, checks for direct flights in the graph, and calculates the total cost. Efficiency is reasonable for small graphs but may become a concern for large graphs due to the nested iterations.

- Time Complexity: O(N^2), where N is the number of vertices. In the worst case, it involves nested iterations over the vertices and edges.
- Space Complexity: O(1), as the method uses a constant amount of additional space.

---

## Solution

[Graph.java](app%2Fsrc%2Fmain%2Fjava%2Fgraphs%2FGraph.java)

```java
public class Graph {
    public Integer businessTrip(Graph graph, String[] cities) {
        int cost = 0;

        for (int i = 0; i < cities.length - 1; i++) {
            int sourceVertex = findVertex(graph, cities[i]);
            int targetVertex = findVertex(graph, cities[i + 1]);

            if (sourceVertex == -1 || targetVertex == -1) {
                return null;
            }

            boolean directFlightExists = false;

            for (Graph.Edge edge : graph.getNeighbors(sourceVertex)) {
                if (edge.targetVertex == targetVertex) {
                    directFlightExists = true;
                    cost += edge.weight;
                    break;
                }
            }

            if (!directFlightExists) {
                return null;
            }
        }

        return cost;
    }

    private int findVertex(Graph graph, String cityName) {
        for (int vertex : graph.getVertices()) {
            if (Integer.toString(vertex).equals(cityName)) {
                return vertex;
            }
        }
        return -1;
    }
}
```
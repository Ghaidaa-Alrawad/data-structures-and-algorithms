# Graph CodeChallenge 35

Implementing a left join operation on two hashmaps.
The first hashmap contains word strings as keys and synonyms as values, while the second hashmap contains word strings as keys and antonyms as values.
The goal is to perform a left join, combining the keys and corresponding values (if they exist) into a new data structure, adhering to the LEFT JOIN logic.

---

## Whiteboard

![35.jpg](img%2F35.jpg)

---

## Approach & Efficiency

1. Add Vertex:

**Approach:**
- Uses a HashMap to store vertices with their corresponding lists of edges.

**Efficiency:**
- O(1) on average for adding a vertex as it involves HashMap insertion.

**Big O Analysis:**
- O(1) on average.

2. Add Edge:

**Approach:**
- Retrieves the list of edges for the source vertex and adds a new edge to it.

**Efficiency:**
- O(1) on average for adding an edge as it involves ArrayList insertion.

**Big O Analysis:**
- O(1) on average.

3. Get Vertices:

**Approach:**
- Retrieves the key set from the HashMap.

**Efficiency:**
- O(1) for retrieving vertices.

**Big O Analysis:**
- O(1).

4. Get Neighbors:

**Approach:**
- Retrieves the list of edges for a given vertex from the HashMap.

**Efficiency:**
- O(1) for retrieving neighbors.

**Big O Analysis:**
- O(1).

5. Size:

**Approach:**
- Returns the size of the HashMap.

**Efficiency:**
- O(1) for retrieving the size.

**Big O Analysis:**
- O(1).
- 
---

## Solution

[Graph.java](app%2Fsrc%2Fmain%2Fjava%2Fgraphs%2FGraph.java)

```java
public class Graph {
    private Map<Integer, List<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public static class Edge {
        public int targetVertex;
        public int weight;

        public Edge(int targetVertex, int weight) {
            this.targetVertex = targetVertex;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return targetVertex + ", " + weight ;
        }
    }

    public int addVertex(int value) {
        adjacencyList.putIfAbsent(value, new ArrayList<>());
        return value;
    }

    public void addEdge(int sourceVertex, int targetVertex, int weight) {
        List<Edge> sourceEdges = adjacencyList.get(sourceVertex);
        sourceEdges.add(new Edge(targetVertex, weight));
    }

    public Collection<Integer> getVertices() {
        return adjacencyList.keySet();
    }

    public Collection<Edge> getNeighbors(int vertex) {
        return adjacencyList.getOrDefault(vertex, new ArrayList<>());
    }

    public int size() {
        return adjacencyList.size();
    }
}
```
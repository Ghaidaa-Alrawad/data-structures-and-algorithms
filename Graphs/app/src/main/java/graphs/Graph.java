package Graphs.app.src.main.java.graphs;

import java.util.*;

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

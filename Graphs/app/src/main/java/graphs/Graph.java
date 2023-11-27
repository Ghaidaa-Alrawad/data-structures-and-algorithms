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

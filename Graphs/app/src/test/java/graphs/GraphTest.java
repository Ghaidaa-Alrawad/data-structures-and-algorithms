package Graphs.app.src.test.java.graphs;

import Graphs.app.src.main.java.graphs.Graph;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class GraphTest {
    @Test
    void addVertex() {
        Graph graph = new Graph();
        int vertex = graph.addVertex(1);
        assertTrue(graph.getVertices().contains(vertex));
    }

    @Test
    void addEdge() {
        Graph graph = new Graph();
        int sourceVertex = graph.addVertex(1);
        int targetVertex = graph.addVertex(2);
        graph.addEdge(sourceVertex, targetVertex, 5);

        Collection<Graph.Edge> neighbors = graph.getNeighbors(sourceVertex);
        assertTrue(neighbors.stream().anyMatch(edge -> edge.targetVertex == targetVertex && edge.weight == 5));
    }

    @Test
    void getVertices() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);

        assertEquals(3, graph.getVertices().size());
    }

    @Test
    void getNeighbors() {
        Graph graph = new Graph();
        int sourceVertex = graph.addVertex(1);
        int targetVertex = graph.addVertex(2);
        graph.addEdge(sourceVertex, targetVertex, 5);

        Collection<Graph.Edge> neighbors = graph.getNeighbors(sourceVertex);
        assertEquals(1, neighbors.size());
        assertTrue(neighbors.stream().anyMatch(edge -> edge.targetVertex == targetVertex && edge.weight == 5));
    }

    @Test
    void size() {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);

        assertEquals(2, graph.size());
    }
}

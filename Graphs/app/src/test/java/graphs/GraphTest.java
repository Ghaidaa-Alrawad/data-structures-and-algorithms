package Graphs.app.src.test.java.graphs;

import Graphs.app.src.main.java.graphs.Graph;
import Graphs.app.src.main.java.graphs.Node;
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

    @Test
    public void testBreadthFirstTraversal() {
        Graph graph = new Graph();
        Node node1 = new Node(graph.addVertex(1));
        Node node2 = new Node(graph.addVertex(2));
        Node node3 = new Node(graph.addVertex(3));
        Node node4 = new Node(graph.addVertex(4));

        graph.addEdge(1, 2, 0);
        graph.addEdge(1, 3, 0);
        graph.addEdge(2, 4, 0);

        Collection<Integer> result = graph.breadthFirst(node1);
        assertTrue(result.contains(1));
        assertTrue(result.contains(2));
        assertTrue(result.contains(3));
        assertTrue(result.contains(4));
        assertEquals(4, result.size());
    }

    @Test
    public void testBreadthFirstTraversalEmptyGraph() {
        Graph graph = new Graph();
        Node node1 = new Node(graph.addVertex(1));

        Collection<Integer> result = graph.breadthFirst(node1);
        assertTrue(result.contains(1));
        assertEquals(1, result.size());
    }

    @Test
    public void testBreadthFirstTraversalDisconnectedGraph() {
        Graph graph = new Graph();
        Node node1 = new Node(graph.addVertex(1));
        Node node2 = new Node(graph.addVertex(2));

        Collection<Integer> result = graph.breadthFirst(node1);
        assertTrue(result.contains(1));
        assertEquals(1, result.size());
    }

    @Test
    void testBusinessTripValidRoute() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 10);

        String[] validRoute = {"1", "2", "3"};
        Integer cost = graph.businessTrip(graph, validRoute);

        assertNotNull(cost);
        assertEquals(15, cost);
    }

    @Test
    void testBusinessTripInvalidRoute() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 10);

        String[] invalidRoute = {"1", "3", "2"};
        Integer cost = graph.businessTrip(graph, invalidRoute);

        assertNull(cost);
    }

    @Test
    void testBusinessTripNonExistentCity() {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addEdge(1, 2, 5);
        graph.addEdge(2, 3, 10);

        String[] nonExistentCityRoute = {"1", "4", "3"};
        Integer cost = graph.businessTrip(graph, nonExistentCityRoute);

        assertNull(cost);
    }
}

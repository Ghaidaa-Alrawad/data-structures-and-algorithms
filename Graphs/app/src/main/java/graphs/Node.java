package Graphs.app.src.main.java.graphs;

import java.util.Objects;

public class Node {

    private int value;

    public Node(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Node node = (Node) obj;
//        return value == node.value;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(value);
//    }
}

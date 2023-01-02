package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void printGraph() {
        System.out.println("Print Graph:");
        System.out.println(adjList);
    }

    public boolean addVertex(String vertex) {
        if (adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vert1, String vert2) {

        addVertex(vert1);
        addVertex(vert2);
        adjList.get(vert2).add(vert1);
        adjList.get(vert1).add(vert2);

        return true;
    }

    public boolean removeEdge(String vert1, String vert2) {
        if (adjList.get(vert2) == null || adjList.get(vert1) == null)
            return false;
        adjList.get(vert2).remove(vert1);
        adjList.get(vert1).remove(vert2);
        return true;
    }

    public boolean removeVertex(String vertex) {
        for (String other : adjList.get(vertex)) {
            adjList.get(other).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}

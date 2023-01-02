package datastructures.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.printGraph();

        System.out.println("-----------------add vertex----------");
        graph.addVertex("vert1");
        graph.addVertex("vert6");
        graph.addVertex("vert6");
        graph.printGraph();

        System.out.println("-----------------add edge----------");
        graph.addEdge("vert1", "vert6");
        graph.printGraph();
        graph.addEdge("vert6", "vert4");
        graph.printGraph();
        graph.addEdge("vert9", "vert8");
        graph.printGraph();

        System.out.println("-----------------remove edge----------");
        graph.removeEdge("vert1", "vert6");
        graph.printGraph();
        graph.removeEdge("vert6", "vert8");
        graph.printGraph();

        System.out.println("-----------------remove vertex----------");
        graph.removeVertex("vert4");
        graph.printGraph();
    }
}

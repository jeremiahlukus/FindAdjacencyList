package com.company;

public class Main {

    public static void main(String[] args) {

        Graph myGraph = new Graph(5);
        myGraph.addVertex(0);
        myGraph.addVertex(1);
        myGraph.addVertex(2);
        myGraph.addVertex(3);
        myGraph.addVertex(4);


        myGraph.addEdge(0, 1);
        myGraph.addEdge(0, 2);
        myGraph.addEdge(0, 3);
        myGraph.addEdge(1, 2);
        myGraph.addEdge(1, 4);
        myGraph.addEdge(2, 3);
        myGraph.addEdge(3, 1);
        myGraph.addEdge(4, 0);
        myGraph.addEdge(4, 3);

        myGraph.print();

    }
}

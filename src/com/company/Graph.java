package com.company;

import java.util.ArrayList;

/**
 * Created by Jeremiah on 3/15/17.
 */
public class Graph {

    Vertex [] vertices;
    int indexCounter = 0;


    class Node{
        public int vertexIndex;
        public Node next;
        public Node(int vertexIndex, Node node){
            this.vertexIndex = vertexIndex;
            next = node;

        }
    }

    class Vertex {
        int name;
        Node adjList;

        Vertex(int name, Node aNode) {
            this.name = name;
            this.adjList = aNode;
        }

    }

    public Graph(int vCount){
        vertices = new Vertex[vCount];
    }

    public void addVertex(int vertex){
        vertices[indexCounter] = new Vertex(vertex, null);
        indexCounter++;
    }

    public void addEdge(int src, int dest){
        int v1Index = indexForName(src);
        int v2Index = indexForName(dest);

        vertices[v1Index].adjList = new Node(v2Index, vertices[v1Index].adjList);

    }

    int indexForName(int name){
        for(int i = 0; i < vertices.length; i++){
            if(vertices[i].name == name){
                return i;
            }
        }
        return -1;

    }

    public void print() {
        System.out.println();
        for (int i = 0; i < vertices.length; i++) {
            System.out.println(vertices[i].name);
            for (Node aNode = vertices[i].adjList; aNode != null; aNode = aNode.next) {
                System.out.println("--->" + vertices[aNode.vertexIndex].name + " " );
            }
            System.out.println("\n");
        }

    }
}

package com.trishan.ds_and_algos;

import java.util.ArrayList;
import java.util.List;

public class AdjacencyList {
  SinglyLL[] adjList;
  int vertices;

  AdjacencyList(int vertices) {
    this.vertices = vertices;
    adjList = new SinglyLL[vertices];
    for (int i = 0; i < vertices; i++) {
      adjList[i] = new SinglyLL();
    }
  }

  void addEdges(int u, int v) {
    adjList[u].add(v);
    adjList[v].add(u);
  }

  void printGraph() {
    for (int i = 0; i < vertices; i++) {
      System.out.print(i + " is connected to ");
      Node curr = adjList[i].head;
      while (curr != null) {
        System.out.print(curr.data + ", ");
        curr = curr.next;
      }
      System.out.println();
    }
  }

  List<Integer> getAdjacentNodes(int node) {
    List<Integer> adjNodes = new ArrayList<>();
    Node curr = adjList[node].head;
    while (curr != null) {
      adjNodes.add(curr.data);
      curr = curr.next;
    }
    return adjNodes;
  }

  void depthFirstSearch(int source) {
    boolean[] visited = new boolean[vertices];
    dfs(source, visited);
  }

  void dfs(int rootNode, boolean[] visited) {
    System.out.println(rootNode);
    visited[rootNode] = true;

    Node curr = adjList[rootNode].head;
    while (curr != null) {
      if (!visited[curr.data]) {
        dfs(curr.data, visited);
      }
      curr = curr.next;
    }
  }

  public static void main(String[] args) {
    AdjacencyList adj = new AdjacencyList(5);
    adj.addEdges(0, 1);
    adj.addEdges(0, 2);
    adj.addEdges(1, 3);
    adj.addEdges(1, 4);
    adj.addEdges(2, 3);
    adj.addEdges(3, 4);

    adj.printGraph();

    System.out.println(adj.getAdjacentNodes(4));
    System.out.println(adj.getAdjacentNodes(3));
  }
}

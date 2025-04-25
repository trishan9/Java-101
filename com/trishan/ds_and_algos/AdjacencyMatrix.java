package com.trishan.ds_and_algos;

import java.util.*;

// If graph is densed, it's better to define graph in adjacent matrix.
// If graph is sparsed, it's better to define graph in adjacent list.

public class AdjacencyMatrix {
  int[][] matrix;
  int vertices;
  Map<Integer, List<Integer>> adjacentNodes = new HashMap<>();

  AdjacencyMatrix(int vertices) {
    this.vertices = vertices;
    matrix = new int[vertices][vertices];
  }

  void addEdges(int u, int v) {
    matrix[u][v] = 1;
    matrix[v][u] = 1;
  }

  void printGraph() {
    for (int i = 0; i < matrix.length; i++) {
      System.out.print(i + " is connected to: ");
      List<Integer> temp = new ArrayList<>();
      for (int j = 0; j < matrix[0].length; j++) {
        boolean isConnected = matrix[i][j] == 1;
        if (isConnected) {
          System.out.print(j + ", ");
          temp.add(j);
        }
      }
      System.out.println();
      adjacentNodes.put(i, temp);
    }
  }

  List<Integer> getAdjacentNodes(int node) {
    return adjacentNodes.get(node);
  }

  List<Integer> getAdjacentNodesV2(int i) {
    List<Integer> adjNodes = new ArrayList<>();
    for (int j = 0; j < vertices; j++) {
      if (matrix[i][j] != 0) {
        adjNodes.add(j);
      }
    }
    return adjNodes;
  }

  void printMatrix() {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  // Breadth First Search
  void bfs(int source) {
    QueueImpl q = new QueueImpl(vertices);
    boolean[] visited = new boolean[vertices];

    q.enqueue(source);
    visited[source] = true;

    while (!q.isEmpty()) {
      int x = q.dequeue();
      System.out.println(x);

      for (int j = 0; j < vertices; j++) {
        if (matrix[x][j] != 0) {
          if (!visited[j]) {
            q.enqueue(j);
            visited[j] = true;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    AdjacencyMatrix adj = new AdjacencyMatrix(5);
    adj.addEdges(0, 1);
    adj.addEdges(0, 2);
    adj.addEdges(1, 3);
    adj.addEdges(1, 4);
    adj.addEdges(2, 3);
    adj.addEdges(3, 4);

    adj.printGraph();
    adj.printMatrix();

    System.out.println(adj.getAdjacentNodes(4));
    System.out.println(adj.getAdjacentNodes(3));

    System.out.println(adj.getAdjacentNodesV2(4));
    System.out.println(adj.getAdjacentNodesV2(3));
  }
}

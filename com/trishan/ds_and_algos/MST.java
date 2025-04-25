package com.trishan.ds_and_algos;

import java.util.*;

public class MST {
  public static class Edge implements Comparable<Edge> {
    int u;
    int v;
    int w;

    Edge(int u, int v, int w) {
      this.u = u;
      this.v = v;
      this.w = w;
    }

    @Override
    public int compareTo(Edge edge) {
      return this.w - edge.w;
    }
  }

  int[][] matrix;
  int vertices;
  Edge[] edges;
  int edgeIndex = -1;

  MST(int vertices) {
    this.vertices = vertices;
    matrix = new int[vertices][vertices];
    edges = new Edge[vertices * (vertices - 1) / 2];
  }

  void addEdges(int u, int v, int w) {
    matrix[u][v] = w;
    matrix[v][u] = w;
    edges[++edgeIndex] = new Edge(u, v, w);
  }

  void krushkalAlgorithm() {
    int[] parent = new int[vertices];
    int[] size = new int[vertices];
    int[][] mst = new int[vertices][vertices];

    for (int i = 0; i < vertices; i++) {
      parent[i] = -1;
    }

    Arrays.sort(edges);
    int edgeTaken = 0;
    int edgeCounter = -1;
    while (edgeTaken < vertices) {
      Edge e = edges[++edgeCounter];
      int uAbsRoot = find(e.u, parent);
      int vAbsRoot = find(e.v, parent);

      if (uAbsRoot == vAbsRoot) {
        continue;
      }
      mst[e.u][e.v] = e.w;
      mst[e.v][e.u] = e.w;
      union(uAbsRoot, vAbsRoot, parent, size);
      edgeTaken++;
    }
  }

  void union(int uAbsRoot, int vAbsRoot, int[] parent, int[] size) {
    if (size[uAbsRoot] > size[vAbsRoot]) {
      parent[vAbsRoot] = uAbsRoot;
    } else if (size[uAbsRoot] < size[vAbsRoot]) {
      parent[uAbsRoot] = vAbsRoot;
    } else {
      parent[uAbsRoot] = vAbsRoot;
      size[vAbsRoot]++;
    }
  }

  int find(int u, int[] parent) {
    if (parent[u] == -1) {
      return u;
    }
    return parent[u] = find(parent[u], parent); // Path Compression
  }

  public static void main(String[] args) {
    MST mst = new MST(5);
  }
}

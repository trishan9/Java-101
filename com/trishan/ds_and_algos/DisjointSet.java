package com.trishan.ds_and_algos;

public class DisjointSet {
  int[] size;
  int[] parent;
  int vertices;

  DisjointSet(int vertices) {
    this.vertices = vertices;
    size = new int[vertices];
    parent = new int[vertices];

    for (int i = 0; i < vertices; i++) {
      parent[i] = -1;
    }
  }

  void findCycle(int u, int v) {
    int uAbsRoot = find(u);
    int vAbsRoot = find(v);

    if (uAbsRoot == vAbsRoot) {
      System.out.println("Cycle Detected"); // if sane abs root, then connected previously, so cycle exists
    }
    // Add Edge to Graph
    union(uAbsRoot, vAbsRoot);
  }

  void union(int uAbsRoot, int vAbsRoot) {
    if (size[uAbsRoot] > size[vAbsRoot]) {
      parent[vAbsRoot] = uAbsRoot;
    } else if (size[uAbsRoot] < size[vAbsRoot]) {
      parent[uAbsRoot] = vAbsRoot;
    } else {
      parent[uAbsRoot] = vAbsRoot;
      size[vAbsRoot]++;
    }
  }

  int find(int u) {
    if (parent[u] == -1) {
      return u;
    }
    return parent[u] = find(parent[u]); // Path Compression
  }

  public static void main(String[] args) {
    DisjointSet d = new DisjointSet(4);
    d.findCycle(0, 1);
    d.findCycle(1, 3);
    d.findCycle(3, 2);
    d.findCycle(0, 2);
  }
}

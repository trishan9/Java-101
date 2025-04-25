package com.trishan.ds_and_algos;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dijkstra {
    int[][] matrix;
    int vertices;
    Map<Integer, List<Integer>> adjacentNodes = new HashMap<>();

    Dijkstra(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void addEdges(int u, int v, int w) {
        matrix[u][v] = w;
        matrix[v][u] = w;
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

    List<Integer> getAdjacentNodes(int i) {
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

    int dijkstra(int source, int destination) {
        int[] dist = new int[vertices];
        int[] prevPath = new int[vertices];
        boolean[] visited = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            dist[i] = Integer.MAX_VALUE;
            prevPath[i] = -1;
        }

        dist[source] = 0;

        for (int i = 0; i < vertices; i++) {
            int minVertex = findMinVertex(dist, visited);
            visited[minVertex] = true;
            for (int j = 0; j < vertices; j++) {
                // Relaxation Step
                int cost = matrix[minVertex][j];
                if (cost != 0 && !visited[j]) {
                    if((dist[minVertex] + cost) < dist[j]) {
                        dist[j] = dist[minVertex] + cost;
                        prevPath[j] = minVertex;
                    }
                }
            }
        }

        // Print Path


        return dist[destination];
    }

    private int findMinVertex(int[] dist, boolean[] visited) {
        int min = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && (min == -1 || dist[i] < dist[min])) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Dijkstra dj = new Dijkstra(6);
        dj.addEdges(0, 1, 10);
        dj.addEdges(0, 5, 100);
        dj.addEdges(0, 2, 5);
        dj.addEdges(1, 2, 2);
        dj.addEdges(1, 3, 5);
        dj.addEdges(2, 3, 10);
        dj.addEdges(2, 4, 20);
        dj.addEdges(3, 5, 2);
        dj.addEdges(4, 5, 5);

        dj.printGraph();
        dj.printMatrix();

        System.out.println(dj.getAdjacentNodes(4));
        System.out.println(dj.getAdjacentNodes(3));
    }
}

package com.trishan.strings.program;

// Find and return the shortest path (displacement):
// Example Input: "WNEENESENNN"
// Example Output : 5 (Shortest Distance)

import java.util.Arrays;

public class ShortestPath {
    public static void main(String[] args) {
        String route = "WNEENESENNN";
        System.out.println(shortestDistance(route));
    }

    static int shortestDistance(String route) {
        int x1 = 0;
        int y1 = 0;
        int[] result = calculateX2Y2(route);
        System.out.println(Arrays.toString(result));
        int x2 = result[0];
        int y2 = result[1];
        return (int)Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5); // -> Formula we learnt on School
//        return Math.abs(x2 - x1) + Math.abs(y2 - y1); // -> Manhattan Distance Formula
    }

    static int[] calculateX2Y2(String route) {
        int[] result = {0, 0};
        for (int i = 0; i < route.length(); i++) {
            char ch = route.charAt(i);
            switch (ch){
                case 'N', 'n' -> result[1] += 1;
                case 'S', 's' -> result[1] -= 1;
                case 'E', 'e' -> result[0] += 1;
                case 'W', 'w' -> result[0] -= 1;
                default -> System.out.println("Invalid");
            }
        }
        return result;
    }
}

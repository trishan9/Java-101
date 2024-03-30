package com.trishan.arrays.program;

import java.util.Arrays;

public class LinearSearch2d {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 6}, {8, 10, 12}, {14, 16}};
        int target = 10;
        System.out.println(Arrays.toString(linearSearch(matrix, target)));
    }

    // Time Complexity: Best Case - O(1), Worst Case - O(n)
    public static int[] linearSearch(int[][] arr, int target) {
        // work on edge cases here, like array being null
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};
        }

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

package com.trishan.arrays.program;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        reverseArrayUnoptimised(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {6, 7, 8, 9, 10, 11};
        System.out.println(Arrays.toString(arr2));
        reverseArrayOptimised(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    // Time Complexity - O(n),
    // Space Complexity O(n) -> extra array will take extra space in memory, so it is memory expensive.
    public static void reverseArrayUnoptimised(int[] arr) {
        int[] revArr = new int[arr.length];
        int in = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            revArr[i] = arr[in];
            in++;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = revArr[i];
        }
    }

    // Time Complexity - O(n),
    // Space Complexity O(1) -> no extra array is created.
    public static void reverseArrayOptimised(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    // Swapping values in array
    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

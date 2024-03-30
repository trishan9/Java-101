package com.trishan.arrays.program;

public class MaxArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 200};
        System.out.println(max(arr));
        System.out.println(maxInRange(arr, 0, 2));
    }

    static int max(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int maxInRange(int[] arr, int start, int end) {
        if (arr == null || arr.length == 0 || start > end) {
            return -1;
        }
        int maxValue = arr[start];
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

}

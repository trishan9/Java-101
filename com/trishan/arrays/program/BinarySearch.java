package com.trishan.arrays.program;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};

        int target = 10;
        System.out.println(binarySearch(numbers, target));
    }

    // Similar to Dictionary, Needs Sorted Arrays
    // Time Complexity - O(log n)
    public static int binarySearch(int[] arr, int target){
        // work on edge cases here, like array being null
        if(arr == null || arr.length == 0){
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > target){
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}

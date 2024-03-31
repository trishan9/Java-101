package com.trishan.arrays.leetcode;

// Link: https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/ (Amazon)

public class InfiniteArray {
    public static void main(String[] args) {
        int[] infiniteArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 25, 26};
        System.out.println(result(infiniteArr, 11));
    }

    static int result(int[] arr, int target){
        int start = 0;
        int end = 1;

        while (target > arr[end]){
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target > arr[mid]){
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

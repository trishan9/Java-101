package com.trishan.arrays.leetcode;

// Link: https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

public class RotationCount {
    public static void main(String[] args) {
        int[] rotatedArr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findRotationCount(rotatedArr));
    }

    static int findRotationCount(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid;
            }

            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return 0;
    }
}

package com.trishan.arrays.leetcode;

// Link: (FAANG+)
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
// https://leetcode.com/problems/find-peak-element/description/

// Also known as Bitonic Array, Increasing, and Decreasing.
public class MountainArr {
    public static void main(String[] args) {
        int[] mountain = {18, 29, 38, 59, 98, 100, 99, 98, 90};
        System.out.println(peakIndexInMountainArray(mountain));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start; // or end (anything, as start == end)
    }
}

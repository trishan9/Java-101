package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/ (LinkedIn Question)

public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 'l'};
        char target = 'f';
        System.out.println((char)smallestLetter(arr, target));
    }

    static int smallestLetter(char[] arr, char target) {
        if (target >= arr[arr.length - 1]) {
            return arr[0];
        }

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target >= arr[mid]) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}

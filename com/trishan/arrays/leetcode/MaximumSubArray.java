package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] numbers = {5, 4, -1, 7, 8};
        System.out.println(maxSubArray(numbers));
    }

    // O(n3)
//        static int maxSubArray(int[] arr) {
//            int max = Integer.MIN_VALUE;
//            for (int start = 0; start < arr.length; start++) {
//                for (int end = start; end < arr.length; end++) {
//                    int sum = 0;
//                    for (int i = start; i <= end; i++) {
//                        sum += arr[i];
//                    }
//                    if (sum > max){
//                        max = sum;
//                    }
//                }
//            }
//            return max;
//        }


    //  Prefix array, also known as a prefix sum array or cumulative sum array, is a data structure used to efficiently
    //  compute the sum of elements in a sub-array of a given array.
    // Using Prefix Sum -> O(n2)
//    static int maxSubArray(int[] arr) {
//        int max = Integer.MIN_VALUE;
//
//        int[] prefixArr = new int[arr.length];
//        prefixArr[0] = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            prefixArr[i] = prefixArr[i - 1] + arr[i];
//        }
//
//        for (int start = 0; start < arr.length; start++) {
//            for (int end = start; end < arr.length; end++) {
//                int sum = start == 0 ? prefixArr[end] : prefixArr[end] - prefixArr[start - 1];
//                if (sum > max) {
//                    max = sum;
//                }
//            }
//        }
//
//        return max;
//    }

    // Kadane's Algorithm is a widely used algorithm to find the maximum sum sub-array within a given array of integers.
    // It efficiently solves the problem in linear time complexity, which makes it very efficient.
    // Using Kadane's Algorithm - O(n)
    static int maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;
        for (int el : arr) {
            curSum += el;
            max = Math.max(curSum, max);
            if (curSum < 0) {
                curSum = 0;
            }
        }

        return max;
    }
}

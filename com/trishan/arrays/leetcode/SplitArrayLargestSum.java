package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/split-array-largest-sum/description/ (Google)

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(splitArray(arr, 2));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for (int el : nums) {
            start = Math.max(start, el);
            end += el;
        }
        return search(nums, k, start, end);
    }

    public static int search(int[] nums, int k, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int count = countNumbers(nums, mid);

            if (count <= k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    public static int countNumbers(int[] nums, int mid) {
        int count = 1;
        int acc = 0;
        for (int el : nums) {
            if (acc + el <= mid) {
                acc += el;
            } else {
                count++;
                acc = el;
            }
        }

        return count;
    }
}

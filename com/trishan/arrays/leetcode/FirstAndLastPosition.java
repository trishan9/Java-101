package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/ (Google, Facebook, Microsoft)

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};

        if (nums == null || nums.length == 0) {
            return result;
        }

        result[0] = search(nums, target, false);
        result[1] = search(nums, target, true);
        return result;
    }

    static int search(int[] nums, int target, boolean rsearch){
        int result = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                result = mid;
                if (rsearch){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return result;
    }
}

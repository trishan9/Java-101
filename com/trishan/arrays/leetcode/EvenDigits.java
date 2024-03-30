package com.trishan.arrays.leetcode;

// Link: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int evenCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int el = nums[i];
            int length = 0;
            while (el > 0){
                length++;
                el /= 10;
            }
            if (length % 2 == 0){
                evenCount++;
            }
        }
        return evenCount;
    }
}


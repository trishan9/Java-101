package com.trishan.arrays.program;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;
        System.out.println(linearSearch(numbers, target));
    }

    // Time Complexity: Best Case - O(1), Worst Case - O(n)
    public static int linearSearch(int[] arr, int target){
        // work on edge cases here, like array being null
        if(arr == null || arr.length == 0){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}

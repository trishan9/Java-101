package com.trishan.arrays.program;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] numbers = {2, 2, 4, 6, 6, 8, 10, 12, 12, 14, 16};
        int target = 10;
        System.out.println(binarySearch(numbers, target));

        int[] numbers2 =  {16, 14, 12, 12, 10, 8, 6, 6, 4, 2, 2};
        int target2 = 10;
        System.out.println(binarySearch(numbers2, target2));
    }

    // If we don't know either the array is sorted in ascending or descending order.
    public static int binarySearch(int[] arr, int target){
        if(arr == null || arr.length == 0){
            return -1;
        }

        boolean isAsc = arr[0] < arr[arr.length -1];

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }

            if (isAsc){
                if (arr[mid] > target){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else{
                if (arr[mid] > target){
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}

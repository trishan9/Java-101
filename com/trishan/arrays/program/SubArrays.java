package com.trishan.arrays.program;

public class SubArrays {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        printSubArrays(numbers);
    }

    static void printSubArrays(int[] arr) {
        // Total Sub Arrays = (n * (n+1)) / 2
        for (int start = 0; start < arr.length; start++) {
            for (int end = start; end < arr.length; end++) {
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

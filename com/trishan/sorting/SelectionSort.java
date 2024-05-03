package com.trishan.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = findMax(arr, last);
            swap(arr, maxIndex, last);
        }
    }

    static int findMax(int[] arr, int last){
        int max = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}

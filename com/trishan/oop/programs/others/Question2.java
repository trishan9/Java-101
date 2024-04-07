package com.trishan.oop.programs.others;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number: ");
            int num = sc.nextInt();
            sc.nextLine();
            nums[i] = num;
        }

        System.out.println(findMax(nums));
        System.out.println(indexOfLargest(nums));
    }

    static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static int indexOfLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}

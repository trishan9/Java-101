package com.trishan.arrays.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        // Array is not continuous in Java as Array Objects are in heap and Heap's objects are not continuous.
        String[] arr = {"Trishan", "Wagle"};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = new int[5]; // Initialise
        Scanner sc = new Scanner(System.in);

        // Take Input in Array
        for (int i = 0; i < 5; i++) {
            arr2[i] = sc.nextInt();
        }

        // For Each Loop
        for (int el : arr2) {
            System.out.println(el);
        }

        System.out.println(Arrays.toString(arr2));
        change(arr2);
        System.out.println(Arrays.toString(arr2)); // Updated as it passes reference on above line instead of value.
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}

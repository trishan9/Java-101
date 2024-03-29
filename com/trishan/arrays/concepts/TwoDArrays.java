package com.trishan.arrays.concepts;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] demo = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int[] arr : demo) {
            System.out.println(Arrays.toString(arr));
        }

        /*
            1, 2, 3
            4, 5
            6, 7, 8, 9
        */
        int[][] demo2 = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        for (int row = 0; row < demo2.length; row++) {
            for (int col = 0; col < demo2[row].length; col++) {
                System.out.print((demo2[row][col]) + " ");
            }
            System.out.println();
        }

        int[][] twoDArr = new int[3][2]; // -> columns not mandatory
        System.out.println(twoDArr.length); // Gives number of rows

        // Taking Input
        Scanner sc = new Scanner(System.in);
        for (int row = 0; row < twoDArr.length; row++) {
            for (int col = 0; col < twoDArr[row].length; col++) {
                twoDArr[row][col] = sc.nextInt();
            }
        }

        for (int[] arr : twoDArr) {
            System.out.println(Arrays.toString(arr));
        }
    }
}

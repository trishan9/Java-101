package com.trishan.college.week_04;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // Multiplication Table of 2 using for loop
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("2 X %d = %d\n", i, i * 2);
        }
        System.out.println();

        // Multiplication Table of 10 from 1
        for (int i = 10; i > 0 ; i--) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d X %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }

        /*
        Prompt user to enter a number
        run loop and ask user the integer until
        the integer is negative
         */
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int userInput = sc.nextInt();
//
//        while(userInput >= 0){
//            System.out.print("Enter the number: ");
//            userInput = sc.nextInt();
//        }
//
//        System.out.println("Exited successfully!");

        // Labeled Break
        outerLoop:
        for (int i = 0; i < 2; i++) {
            innerLoop:
            for (int j = 0; j <= 5; j++) {
                if(j == 2){
                    break outerLoop;
                }
                System.out.println("Inner index " + j);
            }
            System.out.println("Outer index " + i);
        }

        // loop from -5 tp 5, break the loop if the value is positive
        for (int i = -5; i <= 5; i++) {
            if (i > 0) {
                break;
            }
            System.out.println(i);
        }

        // loop from 1 to 20, print the number only if even, use continue to complete
        for (int i = 1; i <= 20; i++) {
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }

        // sc.close();
    }
}

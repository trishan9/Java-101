package com.trishan.college.week_04;

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
    }
}

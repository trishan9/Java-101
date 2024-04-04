package com.trishan.strings.patterns;


public class Patterns {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
    }

    static void pattern1(int n) {
//        *****
//        *****
//        *****
//        *****
//        *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern2(int n) {
//    *
//    **
//    ***
//    ****
//    *****
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void pattern3(int n) {
//    *****
//    ****
//    ***
//    **
//    *
        for (int row = 1; row <= n; row++) {
            for (int col = 5; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }


    static void pattern4(int n) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
        System.out.println();
    }

//            *
//            **
//            ***
//            ****
//            *****
//            ****
//            ***
//            **
//            *
}

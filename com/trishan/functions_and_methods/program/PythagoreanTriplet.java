package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the triplet to check: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        System.out.println(isPythagoreanTriplet(n1, n2, n3) ? "The triplet is Pythagorean Triplet." : "The triplet is not a Pythagorean Triplet.");
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        // a, b, c -> a^2 + b^2 = c^2
        return ((a * a + b * b) == (c * c));
    }
}

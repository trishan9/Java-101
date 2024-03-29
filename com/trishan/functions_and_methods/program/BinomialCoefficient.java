package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 'n' and 'r' to calculate binomial coefficient: ");
        int n = sc.nextInt();
        int r = sc.nextInt();

        System.out.println(calculateBinCoefficient(n, r));
    }

    public static long calculateBinCoefficient (int n, int r) {
        long nFact = factorial(n);
        long rFact = factorial(r);
        long nMinusRFact = factorial(n - r);

        return nFact / (rFact * (nMinusRFact));
    }

    public static long factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

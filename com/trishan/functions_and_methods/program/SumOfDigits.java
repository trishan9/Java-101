package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits (int n){
        int sum = 0;
        int copyOfN = n;

        while (copyOfN > 0){
            int rem = copyOfN % 10;
            sum = sum + rem;
            copyOfN /= 10;
        }

        return sum;
    }
}

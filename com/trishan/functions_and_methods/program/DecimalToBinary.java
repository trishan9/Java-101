package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal number: ");
        System.out.println(decToBin(sc.nextInt()));
    }

    static int decToBin(int n){
        int ans = 0;
        int pow = 0;
        while (n > 0){
            int rem = n % 2;
            ans = ans + (rem * (int)Math.pow(10, pow));
            pow++;
            n/=2;
        }
        return ans;
    }
}

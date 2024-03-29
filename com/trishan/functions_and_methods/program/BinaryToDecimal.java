package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the binary number: ");
        System.out.println(binToDec(sc.nextInt()));
    }

    static int binToDec(int n){
        int ans = 0;
        int pow = 0;
        while (n > 0){
            int rem = n % 10;
            ans = ans + (rem * (int)Math.pow(2, pow));
            pow++;
            n/=10;
        }
        return ans;
    }
}

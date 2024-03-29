package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Armstrong numbers from 1 to 100000
        for (int i = 0; i < 100000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }

        // Check whether the number is armstrong or not
        System.out.print("Enter the number to check armstrong: ");
        int num = sc.nextInt();

        if (isArmstrong(num)) {
            System.out.println("The number is armstrong!");
        } else {
            System.out.println("The number is not an armstrong!");
        }
    }

    static boolean isArmstrong(int n) {
        int length = 0;
        int copyOfN = n;
        int copyOfN2 = n;
        int sum = 0;

        while (copyOfN > 0) {
            length++;
            copyOfN /= 10;
        }

        while (copyOfN2 > 0) {
            int rem = copyOfN2 % 10;
            int result = 1;
            for (int i = 0; i < length; i++) {
                result *= rem;
            }
            sum += result;
            copyOfN2 /= 10;
        }

        return sum == n;
    }
}

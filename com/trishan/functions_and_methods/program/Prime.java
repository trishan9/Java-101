package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Prime numbers from 1 to 100
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }

        // Check whether the number is Prime or not
        System.out.print("Enter the number to check prime: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is prime!");
        } else {
            System.out.println("The number is not prime!");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num == 2) {
            return true;
        }

        boolean isPrimeFlag = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrimeFlag = false;
                break;
            }
        }
        return isPrimeFlag;
    }
}

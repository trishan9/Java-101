package com.trishan.functions_and_methods.program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Print Palindrome numbers from 1 to 100
        for (int i = 0; i < 100; i++) {
            if (isPalindrome(i)) {
                System.out.println(i);
            }
        }

        // Check whether the number is palindrome or not
        System.out.print("Enter the number to check palindrome: ");
        int num = sc.nextInt();

        if (isPalindrome(num)) {
            System.out.println("The number is palindrome!");
        } else {
            System.out.println("The number is not palindrome!");
        }
    }

    static boolean isPalindrome(int num) {
        int rev = 0;
        int copyOfNum = num;

        while (copyOfNum > 0) {
            int rem = copyOfNum % 10;
            rev = (rev * 10) + rem;
            copyOfNum /= 10;
        }

        return rev == num;
    }
}

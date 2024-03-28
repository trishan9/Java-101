package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check palindrome: ");
        int num = sc.nextInt();

        int n = num;
        int rev = 0;

        while(n > 0){
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }

        System.out.println("Reverse of the number " + num + " is " + rev);

        if (num == rev){
            System.out.println("Palindrome!");
        } else {
            System.out.println("Not a palindrome!");
        }
    }
}

package com.trishan;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        // Write a Java program to calculate and print the factorial of a given number using for loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);

        // Write a Java program to calculate and print the factorial of a given number using while loop.
        int i = 1;
        fact = 1;
        while (i <= num){
            fact *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + fact);
    }
}
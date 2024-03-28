package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        // for loop: when we know or can predict the number of times the loop will run
        // Write a Java program to calculate and print the factorial of a given number using for loop.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for factorial: ");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact);

        // while loop: when we don't know or can't predict the number of times the loop will run
        // Write a Java program to calculate and print the factorial of a given number using while loop.
        int i = 1;
        fact = 1;
        while (i <= num){
            fact *= i;
            i++;
        }
        System.out.println("The factorial of " + num + " is " + fact);


        // do-while loop: runs minimum 1 time even if condition is false
        // Write a Java program to calculate and print the factorial of a given number using do while loop.
        i = 1;
        fact = 1;
        do{
            fact *= i;
            i++;
        }
        while (i <= num);
        System.out.println("The factorial of " + num + " is " + fact);
    }
}
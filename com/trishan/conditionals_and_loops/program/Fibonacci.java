package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Find the nth fibo

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the n for fibo: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        int temp;

//        int i =2;
//        while (i < n){
//            temp = b;
//            b = a + b;
//            a = temp;
//            i++;
//        }

        for (int i = 2; i<n; i++){
            temp = b;
            b = a + b;
            a = temp;
        }

        System.out.println(n + "th " + "Fibo is: " + b);

        // Print the fibo series up to n
        a = 0;
        b = 1;
        System.out.println("Fibonacci series up to " + n + "th term:");
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i<n; i++){
            temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
       }
    }
}

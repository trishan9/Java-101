package com.trishan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello Trishan!");

        // Taking Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

        int userId = 12;

        String userName = "Trishan";

        System.out.println(userId);
        System.out.println(userName);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        float sum = num1 + num2;
        System.out.println("The sum is " + (int)(sum));
    }
}

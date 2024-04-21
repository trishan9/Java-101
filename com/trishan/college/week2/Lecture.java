package com.trishan.college.week2;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // 1. Write a program to check whether a variable is greater or equal to 18
        int num = 19;
        if (num >= 18) {
            System.out.println("Yes it is greater than or equal to 18!");
        } else {
            System.out.println("No, it is not greater than or equal to 18!");
        }

        // 2. Write a program to calculate SI.
        int principle = 10000;
        double time = 2;
        double rate = 5.5;
        double simpleInterest = (principle * time * rate) / 100;
        System.out.printf("The simple interest is: Rs.%.2f\n", simpleInterest);

        // 3. Write a program to calculate, area and perimeter of rectangle
        double length = 12;
        double breadth = 14;

        int area = (int) (length * breadth);
        System.out.println("Area is: " + area + "cm^2");

        int perimeter = (int) (2 * (length + breadth));
        System.out.println("Perimeter is: " + perimeter + "cm");

        // 4. Write the ternary operator for question no. 1
        System.out.println(num >= 18 ? "Yes it is greater than or equal to 18!" : "No, it is not greater than or equal to 18!");

        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        System.out.print("Are you over 18? ");
        boolean status = sc.nextBoolean();

        System.out.print("How many siblings do u have? ");
        int sibling = sc.nextInt();

        System.out.printf("Hello, %s\nOver 18? %b\nYou have %d num of sibling", name, status, sibling);

        if(args.length > 1){
            System.out.println("The first arg is " + args[0]);
            System.out.println("The second arg is " + args[1]);
            int sum = 10 + Integer.parseInt(args[1]);
            System.out.println(sum);
        } else {
            System.out.println("Not enough arguments");
        }
    }
}

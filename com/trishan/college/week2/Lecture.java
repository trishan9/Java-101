package com.trishan.college.week2;

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
    }
}

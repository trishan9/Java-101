package com.trishan.college.week_03;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // 1. Write a JAVA program to find the maximum between three numbers.
        int num1 = 10, num2 = 20, num3 = 30;
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " is greatest");
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " is greatest");
        } else {
            System.out.println(num3 + " is greatest");
        }

        // 2. Write a JAVA program to check whether a number is negative, positive, or zero.
        if(num1 > 0){
            System.out.println("Positive");
        } else if (num1 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
        if(num1 % 5 == 0 && num1 % 11 == 0){
            System.out.println("Divisible by 5 and 11");
        } else {
            System.out.println("Not divisible by 5 and 11");
        }

        // 4. Write a JAVA program to check whether a number is even or odd.
        if(num1 % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // 5. Write a JAVA program to check whether a year is a leap year or not.
        // Hint: if year%4==0; if year%100!==0 ; year%400==0;
        int year = 2024;
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year!");
        } else if (year % 400 == 0) {
            System.out.println("Leap year!");
        } else {
            System.out.println("Not a leap year!");
        }

        // 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant.
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().toLowerCase().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        } else {
            System.out.println("Consonants");
        }

        // Switch case Statements Questions
        // 1. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the
        // corresponding GPA value. Use a switch case statement to handle different grades.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's grade (A, B, C, D, or F): ");
        char grade = scanner.next().charAt(0);
        double gpa;

        switch (grade) {
            case 'A':
                gpa = 4.0;
                break;
            case 'B':
                gpa = 3.0;
                break;
            case 'C':
                gpa = 2.0;
                break;
            case 'D':
                gpa = 1.0;
                break;
            case 'F':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                return;
        }
        System.out.println("Equivalent GPA: " + gpa);

        // 2. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the
        // corresponding arithmetic operation using a switch case statement.
        System.out.print("Enter first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        double result;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println("Invalid operator entered.");
                return;
        }
        System.out.println("Result: " + result);

        // 3. Write a Java program that takes an integer input (1 to 12) representing a month and prints the
        // corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case.
        System.out.print("Enter month (1 to 12): ");
        int month = scanner.nextInt();
        String season = switch (month) {
            case 12, 1, 2 -> "Winter";
            case 3, 4, 5 -> "Spring";
            case 6, 7, 8 -> "Summer";
            case 9, 10, 11 -> "Fall";
            default -> "Invalid month entered.";
        };
        System.out.println("Season: " + season);

        // 4. Implement a Java program that calculates the area of different
        // shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.
        System.out.println("Choose shape (1: Circle, 2: Rectangle, 3: Square, 4: Triangle): ");
        int choice = scanner.nextInt();
        double area;

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = scanner.nextDouble();
                area = Math.PI * Math.pow(radius, 2);
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width of the rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                break;
            case 3:
                System.out.print("Enter side length of the square: ");
                double side = scanner.nextDouble();
                area = Math.pow(side, 2);
                break;
            case 4:
                System.out.print("Enter base of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height of the triangle: ");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice entered.");
                return;
        }

        System.out.println("Area: " + area);

        sc.close();
    }
}

package com.trishan.college.week_02;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        if (age > 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote!");
        }

        // 2. Write a program to calculate SI.
        System.out.print("Enter principle amount: ");
        int principle = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter time: ");
        double time = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter rate: ");
        double rate = sc.nextDouble();
        sc.nextLine();
        double simpleInterest = (principle * time * rate) / 100;
        System.out.printf("The simple interest is: %.2f\n", simpleInterest);

        // 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();
        sc.nextLine();
        double areaOfTriangle = 0.5 * base * height;
        System.out.printf("The area of triangle with base %.2f and height %.2f is %.2fcm^2\n", base, height, areaOfTriangle);

        System.out.print("Enter the side of cube: ");
        double side = sc.nextDouble();
        sc.nextLine();
        double volumeOfCube = Math.pow(side, 3);
        System.out.printf("The volume of cube with side %.2f is %.2fcm^3\n", side, volumeOfCube);

        System.out.print("Enter the length of cuboid: ");
        double length = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the breadth of cuboid: ");
        double breadth = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter the height of cuboid: ");
        double heightOfCuboid = sc.nextDouble();
        sc.nextLine();
        double volumeOfCuboid = length * breadth * heightOfCuboid;
        System.out.printf("The volume of cuboid is %.2fcm^3\n", volumeOfCuboid);

        // 4. Write the ternary operator for question no. 1
        System.out.println(age > 18 ? "You can vote!" : "You can't vote!");

        // 5. Write a program to take two integer inputs from the user and print the sum and product of them.
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        int sumOfNums = num1 + num2;
        int prodOfNums = num1 * num2;
        System.out.println("The sum of two numbers is: " + sumOfNums);
        System.out.println("The product of two numbers is: " + prodOfNums);

        // 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two.
        // Finally, calculate the division of the thus obtained sum and product and print the result.
        double divisionOfSumAndProd = (double) sumOfNums / prodOfNums;
        System.out.println("The division of obtained sum and product is: " + divisionOfSumAndProd);

        // 7. Take the name, roll number, and field of interest from the user and print in the format below:
        // Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz.
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your field of interests (separated with comma): ");
        String fieldOfInterest = sc.nextLine();
        System.out.printf("Hey, my name is %s and my roll number is %d. My field of interest are %s\n", name, rollNumber, fieldOfInterest);

        // 8. Take side of a square from user and print area and perimeter of it.
        System.out.print("Enter the side of square: ");
        double sideOfSquare = sc.nextDouble();
        sc.nextLine();
        double areaOfSquare = sideOfSquare * sideOfSquare;
        double perimeterOfSquare = 4 * sideOfSquare;
        System.out.println("The area of square is: " + areaOfSquare);
        System.out.println("The perimeter of square is: " + perimeterOfSquare);

        // 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int.
        System.out.print("Enter length of rectangle: ");
        double doubleLength = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter breadth of rectangle: ");
        double doubleBreadth = sc.nextDouble();
        sc.nextLine();

        int intArea = (int) (doubleLength * doubleBreadth);
        System.out.println("Area is: " + intArea);

        /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage
        secured. And use the following conditions to generate the final result;
         a. If equal to or more than 70 -> First Class
         b. If more than 59 -> Upper Second Class
         c. If more than 49 -> Second class
         d. If more than 39 -> Third class and if below than 40 the result is fail.
        Hint: Use ternary operator */
        System.out.print("Enter the marks obtained in subject 1: ");
        double subject1Marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the marks obtained in subject 2: ");
        double subject2Marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the marks obtained in subject 3: ");
        double subject3Marks = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter the marks obtained in subject 4: ");
        double subject4Marks = sc.nextDouble();
        sc.nextLine();

        double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        double totalPercentage = totalMarks / 4;

        String result = totalPercentage >= 70 ? "First Class" : totalPercentage > 59 ? "Upper Second Class" :
                totalPercentage > 49 ? "Second Class" : totalPercentage > 39 ? "Third Class" : "Fail";

        System.out.printf("Your total marks is %f, percentage is %f, and your final result is %s.", totalMarks, totalPercentage, result);

        sc.close();
    }
}

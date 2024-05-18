package com.trishan.college.week_04;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        // 1. Write a program that asks your name and prints “Hello your name” five times. Use a loop.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + name);
        }

        // 2. Write a program that displays the following table (note that 1 mile is 1.609 kilometers):
        //
        //Miles    Kilometers
        //
        //1    1.609
        //
        //2    3.218
        //
        //…    ….
        //
        //9    14.481
        //
        //10    16.090
        System.out.println("Miles\tKilometers");
        for (int miles = 1; miles <= 10; miles++) {
            double kilometers = miles * 1.609;
            System.out.printf("%d\t\t%f\n", miles, kilometers);
        }

        // 3. Write a program that generates the following table:
        //
        //Number    Square
        //
        //10    100
        //
        //9    81
        //
        //..    ….2    4
        //
        //1    1
        System.out.println("Number\tSquare");
        for (int number = 10; number >= 1; number--) {
            System.out.println(number + "\t\t" + (number * number));
        }

        // 4. Write a program that reads the width and generates a corresponding square of *. For example, if width = 5, output is:
        //
        //*****
        //
        //*****
        //
        //*****
        //
        //*****
        //
        //*****
        System.out.print("Enter the width of the square: ");
        int width = scanner.nextInt();

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 5. Modify the above program by using a do..while loop so that it provides the user with the option to continue running the program and enter more inputs. For example:
        //
        //Sample Run:
        //
        //Enter a positive non-zero integer 4
        //
        //Sum of 1 to 4 is 10
        //
        //Do you want to continue? Enter ‘y’ for yes or any other character for no.
        //
        //y
        //
        //Enter a positive non-zero integer 3
        //
        //Sum of 1 to 3 is 6
        //
        //Do you want to continue? Enter ‘y’ for yes and any other character for no.
        //
        //n.
        char continueChoice;
        do {
            System.out.print("Enter a positive non-zero integer: ");
            int number = scanner.nextInt();

            int sum = 0;
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
            System.out.println("Sum of 1 to " + number + " is " + sum);

            System.out.print("Do you want to continue? Enter ‘y’ for yes or any other character for no: ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'y' || continueChoice == 'Y');

        // 6. Write a program that reads the width and generates a corresponding triangle of *. For example, if width = 5, output is:
        //
        //*
        //
        //**
        //
        //***
        //
        //****
        //
        //*****
        //
        //Use a nested for loop to generate the above pattern.
        System.out.print("Enter the width of the triangle: ");
        int width2 = scanner.nextInt();

        for (int i = 1; i <= width2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 7. Write a program to calculate the HCF of Two given numbers.
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf = a;
        System.out.println("HCF of " + num1 + " and " + num2 + " is " + hcf);

        // 8. Write a program that prompts the user to input an integer and then outputs the number with the digits reversed.
        // For example, if the input is 12345, the output should be 54321.
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed number is " + reversedNumber);

        // 9. Write a program that reads ten integer numbers and outputs the number of inputs which are greater than 50,
        // less than 50 or equal to 50. The program should also display the average of all numbers greater than 50 and
        // the average of all numbers less than 50.
        int greaterThan50 = 0, lessThan50 = 0, equalTo50 = 0;
        int sumGreaterThan50 = 0, sumLessThan50 = 0;
        int countGreaterThan50 = 0, countLessThan50 = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int num = scanner.nextInt();
            if (num > 50) {
                greaterThan50++;
                sumGreaterThan50 += num;
                countGreaterThan50++;
            } else if (num < 50) {
                lessThan50++;
                sumLessThan50 += num;
                countLessThan50++;
            } else {
                equalTo50++;
            }
        }

        double avgGreaterThan50 = (countGreaterThan50 == 0) ? 0 : (double) sumGreaterThan50 / countGreaterThan50;
        double avgLessThan50 = (countLessThan50 == 0) ? 0 : (double) sumLessThan50 / countLessThan50;

        System.out.println("Number of inputs greater than 50: " + greaterThan50);
        System.out.println("Number of inputs less than 50: " + lessThan50);
        System.out.println("Number of inputs equal to 50: " + equalTo50);
        System.out.println("Average of numbers greater than 50: " + avgGreaterThan50);
        System.out.println("Average of numbers less than 50: " + avgLessThan50);

        // 10. Write a program that asks the user for a positive nonzero integer value. The program should use a loop
        // to get the sum of all the integers from 1 up to the number entered. For example, if the user enters 50,
        // the loop will find the sum of 1+2+3+4+….+50.
        System.out.print("Enter a positive nonzero integer: ");
        int num = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println("Sum of 1 to " + num + " is " + sum);
    }
}

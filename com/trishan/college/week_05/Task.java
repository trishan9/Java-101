package com.trishan.college.week_05;

import java.util.Scanner;

public class Task {
    // 1. Make a method to check if a number is prime or not.
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 2. Make a method to check if a given number n is even or not.
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // 3. Make a method to print the table of a given number n.
    public static void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    // 4. Write a program for multiplying 3 numbers using a method and return the result and print the result from the main method.
    public static int multiplyThreeNumbers(int a, int b, int c) {
        return a * b * c;
    }

    // 5. Write a program for calculating Simple Interest using a method and print the result from the method itself.
    public static void calculateSimpleInterest(double principal, double rate, double time) {
        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest is: " + interest);
    }

    // 6. Write a program to calculate the area of a rectangle using a method of your choice.
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    // 7. Calculates the factorial of a given number using the Java method.
    public static long factorial(int n) {
        if (n == 0) return 1;
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 8. Calculate the nth Fibonacci number using the method.
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }

    // 9. Write a Java program to find the greatest common divisor (GCD) of two numbers.
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 10. Write a Java program to display all prime numbers less than a given number and count all the prime numbers less than that number using functions.
    public static void printPrimesLessThan(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static int countPrimesLessThan(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it is prime: ");
        int primeCheckNumber = scanner.nextInt();
        System.out.println("Is " + primeCheckNumber + " prime? " + isPrime(primeCheckNumber));

        System.out.print("Enter a number to check if it is even: ");
        int evenCheckNumber = scanner.nextInt();
        System.out.println("Is " + evenCheckNumber + " even? " + isEven(evenCheckNumber));

        System.out.print("Enter a number to print its table: ");
        int tableNumber = scanner.nextInt();
        printTable(tableNumber);

        System.out.print("Enter three numbers to multiply: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        System.out.println("The product is: " + multiplyThreeNumbers(num1, num2, num3));

        System.out.print("Enter principal, rate, and time for simple interest calculation: ");
        double principal = scanner.nextDouble();
        double rate = scanner.nextDouble();
        double time = scanner.nextDouble();
        calculateSimpleInterest(principal, rate, time);

        System.out.print("Enter length and width to calculate the area of a rectangle: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle is: " + calculateRectangleArea(length, width));

        System.out.print("Enter a number to calculate its factorial: ");
        int factorialNumber = scanner.nextInt();
        System.out.println("Factorial of " + factorialNumber + " is " + factorial(factorialNumber));

        System.out.print("Enter a number to calculate its nth Fibonacci: ");
        int fibonacciNumber = scanner.nextInt();
        System.out.println(fibonacciNumber + "th Fibonacci number is " + fibonacci(fibonacciNumber));

        System.out.print("Enter two numbers to find their GCD: ");
        int gcdNum1 = scanner.nextInt();
        int gcdNum2 = scanner.nextInt();
        System.out.println("GCD of " + gcdNum1 + " and " + gcdNum2 + " is " + gcd(gcdNum1, gcdNum2));

        System.out.print("Enter a number to print all primes less than it: ");
        int primesLessThan = scanner.nextInt();
        printPrimesLessThan(primesLessThan);
        System.out.println("Total prime numbers less than " + primesLessThan + " are " + countPrimesLessThan(primesLessThan));
    }
}

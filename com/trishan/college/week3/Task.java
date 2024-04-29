package com.trishan.college.week3;

import java.util.Locale;
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

        sc.close();
    }
}

package com.trishan.college.week_03;

import java.util.Scanner;

public class Lecture {
    public static void main(String[] args) {
        // Task 1
        Scanner sc = new Scanner(System.in);

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

        if (subject1Marks < 35 || subject2Marks < 35 || subject3Marks < 35 || subject4Marks < 35) {
            System.out.println("Fail!");
        } else {
            double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
            double average = totalMarks / 4;

            if (average > 100) {
                System.out.println("Invalid");
            } else if (average < 0) {
                System.out.println("Invalid");
            } else if (average < 60) {
                System.out.println("Third division!");
            } else if (average < 70) {
                System.out.println("Second division!");
            } else if (average < 80) {
                System.out.println("First division!");
            } else if (average >= 80) {
                System.out.println("Distinction!");
            } else {
                System.out.println("Invalid!");
            }
        }

        int day = sc.nextInt();

        switch(day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Invalid day!");
        }
    }
}

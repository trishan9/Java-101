package com.trishan.conditionals_and_loops.concepts;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        // Basic Switch Statement
        switch (fruit) {
            case "apple":
                System.out.println("One Apple a day keeps a doctor away!");
                break;
            case "mango", "orange":
                System.out.println("Great round fruit!");
                break;
            default:
                System.out.println("Invalid Choice!");
        }

        // Printing days of week using enhanced switch statements
        int day = sc.nextInt();

        switch(day) {
            case 1 -> System.out.println("Sunday");
            case 2 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
            default -> System.out.println("Invalid Choice!");
        }
    }
}

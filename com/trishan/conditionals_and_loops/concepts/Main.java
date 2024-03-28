package com.trishan.conditionals_and_loops.concepts;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 65) {
            System.out.println("You can't vote, You are Old!");
        } else if (age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can't vote, You are a Child!");
        }

        // for loop: when we know or can predict the number of times the loop will run
        // for (initialization; condition; increment/decrement) {
        // statements
        // }

        // while loop: when we don't know or can't predict the number of times the loop
        // will run
        // initialization
        // while (condition) {
        // statement
        // increment / decrement
        // }

        // do-while loop: runs minimum 1 time even if condition is false
        // initialization
        // do {
        // statement
        // increment / decrement
        // } while (condition);
    }
}

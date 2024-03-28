package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class CheckOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.print("Enter the number to check occurrence of: ");
        int target = sc.nextInt();

        int count = 0;

        while (num > 0){
            int rem = num % 10; // Gives last digit

            if (rem == target){
                count++;
            }

            num /= 10; // Removes last digit
        }

        System.out.println("The total occurrence is " + count);
    }
}

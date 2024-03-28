package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class SecondGreatestNum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int secondGreatest = 0;
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();

        // Using If Elseif Else
        if (num1 > num2 && num1 > num3){
            if (num2 > num3){
                secondGreatest = num2;
            } else {
                secondGreatest = num3;
            }
        } else if (num2 > num1 && num2 > num3) {
            if (num1 > num3){
                secondGreatest = num1;
            } else {
                secondGreatest = num3;
            }
        } else {
            if (num1 > num2){
                secondGreatest = num1;
            } else {
                secondGreatest = num2;
            }
        }
        System.out.println("The second greatest number is: " + secondGreatest);

        // Using Math.max
        secondGreatest = (Math.min(num3, Math.max(num1, num2)));
        System.out.println("The second greatest number is: " + secondGreatest);
    }
}

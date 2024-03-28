package com.trishan.conditionals_and_loops.program;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;

        while (true){
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);

            if (op == 'x' || op == 'X') {
                break;
            } else if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.print("Enter any two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (op == '+'){
                    result = num1 + num2;
                }
                if (op == '-'){
                    result = num1 - num2;
                }
                if (op == '*'){
                    result = num1 * num2;
                }
                if (op == '/'){
                    if (num2 > 0){
                        result = num1 / num2;
                    }
                }
                if (op == '%'){
                    result = num1 % num2;
                }

                System.out.println(result);
            } else {
                System.out.println("Invalid Operation!");
            }
        }
    }
}
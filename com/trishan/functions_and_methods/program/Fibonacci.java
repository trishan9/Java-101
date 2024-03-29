package com.trishan.functions_and_methods.program;

public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci(i));
        }
    }

    static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        int a = 0;
        int b = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }
        return b;
    }
}

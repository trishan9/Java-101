package com.trishan.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Taking Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine());

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        float cel = sc.nextFloat();
        float far = (cel * 9 / 5) + 32;
        System.out.println("The temperature in Fahrenheit: " + far);

        // Data Types, Type Conversion, Type Casting, Type Promotions in Expressions
        // Primitive Data Types
        byte b = 4; // 1 byte - 8 bits
        short s = 512; // 2 bytes
        char c = 'a'; // 2 bytes
        boolean bool = true; // 1 byte
        int i = 1000; // 4 bytes
        float f = 3.14f; // 4 bytes
        double d = 99.9954; // 8 bytes
        long l = 111111_111_111L; // 8 bytes

        // Type Conversion (must: Destination Type >= Source Type) - No User Involvement
        System.out.println(i + f); // Here integer is changed to float automatically

        // Type Casting - Done by User
        System.out.println((int)(f));

        // Type Promotions in Expressions
        // 1. char, short, byte -> int
        // 2. float, long, double -> largest datatype
        System.out.println('a' + 1); // 'a' is promoted to int i.e. 97 as per ASCII

        double result = (f * b) + (i % c) - (d * s); // type will be double as it's largest in this expression.
        System.out.println(result);
    }
}

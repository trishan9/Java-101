package com.trishan.basics;

import java.util.Scanner;

public class Main {
    // Instance Variable - Access with objects, is not shared with other objects
    int instanceVariable = 120;
    // Static Variable - Access with class, is shared with other objects
    static int staticVariable = 2000;

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Local Variable
        int a = 10;

        Main obj = new Main();
        System.out.println(obj.instanceVariable);
        System.out.println(Main.staticVariable);
        System.out.println(a);

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
        float f = 3.14f; // 4 bytes - f is required
        double d = 99.9954d; // 8 bytes - d is optional
        long l = 111111_111_111L; // 8 bytes - L is optional

        // Non-Primitive Data Types
        String str1 , str2;
        str1 = "Trishan";
        str2 = "Wagle";
        String str3 = "Hello", str4 = "World";

        // Type Conversion (must: Destination Type >= Source Type) - No User Involvement - (Widening / Implicit Casting)
        System.out.println(i + f); // Here integer is changed to float automatically

        // Type Casting (Narrowing / Explicit Casting) - Done by User / Larger datatype to smaller datatype
        System.out.println((int)(f));

        // Type Promotions in Expressions
        // 1. char, short, byte -> int
        // 2. float, long, double -> largest datatype
        System.out.println('a' + 1); // 'a' is promoted to int i.e. 97 as per ASCII

        double result = (f * b) + (i % c) - (d * s); // type will be double as it's largest in this expression.
        System.out.println(result);
    }
}

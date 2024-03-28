package com.trishan.functions_and_methods.concepts;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add("1", "2"));
    }

    static int add(int a, int b) {
        // Adds two integers and returns it
        System.out.println("First one!");
        return a + b;
    }

    static int add(int a, int b, int c) {
        // Adds three integers and returns it
        System.out.println("Second one!");
        return a + b + c;
    }

    static String add(String a, String b) {
        // Concatenates two strings and returns it
        System.out.println("Third one!");
        return a + b;
    }
}

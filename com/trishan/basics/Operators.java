package com.trishan.basics;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
            // -> Binary Operators - + - * / %
            // -> Unary Operators - ++a, a++, --a, a--

        // Relational Operators -> == < > <= >= !=

        // Logical Operators -> && || !

        // Assignment Operators -> = += -= /= *=

        // Ternary Operators
        int age = 12;
        System.out.println(age >= 18 ? "Can Vote" : "Can't vote");

        // Bitwise Operators (bit manipulation)
        // & | ^ ~ << >>

        System.out.println(~6); // -7
        System.out.println(~-11); // 10

        System.out.println(5 << 3); // 5 * (2 ** 3) -> 40
        System.out.println(6 >> 1); // 6 // (2 ** 1) -> 3
    }
}

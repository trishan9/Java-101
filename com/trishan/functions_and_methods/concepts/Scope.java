package com.trishan.functions_and_methods.concepts;

public class Scope {
    public static void main(String[] args) {
//        System.out.println(name); -> can't access as it's defined in method scope of myFunc()

        int a = 10; // Method Scope

        {
            a = 15; // can modify but can't declare variable of same name
            int b = 10; // Block Scope
        }
        System.out.println(a); // 15
//        System.out.println(b); -> can't access as it's defined in block scope.

        for (int i = 0; i<5; i++){ // Here 'i' is defined in loop scope so only accessible inside block of this for loop.
            System.out.println(i);
        }
//        System.out.println(i); -> can't access as it's defined in loop scope.
    }

    static void myFunc() {
        String name = "Trishan"; // Method Scope

//        System.out.println(a); -> can't access as it's defined in method scope of main()
    }
}

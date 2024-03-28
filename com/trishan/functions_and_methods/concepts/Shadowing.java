package com.trishan.functions_and_methods.concepts;

public class Shadowing {
    static int num = 10; // this is shadowed at line 9.

    public static void main(String[] args) {
        System.out.println(num); // 10
        int num = 100;
        System.out.println(num); // 100 -> the class variable at line 4 is shadowed by this.

        myFun(); // 10
    }

    static void myFun() {
        System.out.println(num);
    }
}

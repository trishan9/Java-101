package com.trishan.oop.principles.polymorphism;

public class Overloading {
    int sum(int a, int b) {
        return a + b;
    }

    String sum(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();
        System.out.println(obj.sum(3, 5));
        System.out.println(obj.sum("3", "5"));
    }
}

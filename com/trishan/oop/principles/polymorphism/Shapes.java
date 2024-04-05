package com.trishan.oop.principles.polymorphism;

public class Shapes {
    void area(){
        System.out.println("Shapes");
    }

    // final can be used to avoid Overriding and Inheritance as well.
    final void method(){
        System.out.println("I can't be overridden.");
    }
}

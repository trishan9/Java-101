package com.trishan.oop.principles.polymorphism;

public class Overriding extends Shapes {
    // Static methods can't be overridden, but is inherited.
    @Override
    void area(){
        System.out.println("No area here!");
    }

    public static void main(String[] args) {
        Overriding obj = new Overriding();
        obj.area();
    }
}

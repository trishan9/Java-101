package com.trishan.oop.principles.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();

        // Types of Polymorphism: Compile-time/Static (Overloading), Runtime/Dynamic (Overriding),
    }
}

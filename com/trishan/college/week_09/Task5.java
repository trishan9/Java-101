package com.trishan.college.week_09;

public class Task5 {
//    Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'.
//    Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in
//    'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical
//    inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(5, 8);
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());

        Circle2 circ = new Circle2(4);
        System.out.println(circ.calculateArea());
        System.out.println(circ.calculateCircumference());
    }
}

class Shape2 {
    protected int length;
    protected int breadth;
    protected double radius;

    Shape2(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Shape2(double radius){
        this.radius = radius;
    }

    double calculateArea(){
        return 0;
    }
}

class Rectangle2 extends Shape2 {
    Rectangle2(int length, int breadth){
        super(length, breadth);
    }

    @Override
    double calculateArea(){
        return super.length * super.breadth;
    }

    double calculatePerimeter(){
        return 2 * (super.length + super.breadth);
    }
}

class Circle2 extends Shape2 {
    private static final float PI = 3.14f;

    Circle2(double radius){
        super(radius);
    }

    @Override
    double calculateArea(){
       return PI * (int)Math.pow(super.radius, 2);
    }

    double calculateCircumference(){
        return 2 * PI * super.radius;
    }
}


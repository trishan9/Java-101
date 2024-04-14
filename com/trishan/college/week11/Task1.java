package com.trishan.college.week11;

public class Task1 {
//    You are developing a shape drawing application. There are different types of shapes such as circles, rectangles, and
//    triangles. Each shape has its own area calculation method. Implement a Java program using polymorphism to calculate
//    and display the area of different shapes.
    public static void main(String[] args) {
        Circle circ = new Circle(3);
        Rectangle rect = new Rectangle(5, 4);
        Triangle tri = new Triangle(5, 4);

        System.out.println(circ.calculateArea());
        System.out.println(rect.calculateArea());
        System.out.println(tri.calculateArea());
    }
}

class Shape {
    protected int length;
    protected int breadth;
    protected double radius;
    protected float base;
    protected float height;

    Shape(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    Shape(double radius){
        this.radius = radius;
    }

    Shape(float base, float height){
        this.base = base;
        this.height = height;
    }

    double calculateArea(){
        return 0;
    }
}

class Circle extends Shape {
    private static final float PI = 3.14f;

    Circle(double radius){
        super(radius);
    }

    @Override
    double calculateArea(){
        return PI * (int)Math.pow(super.radius, 2);
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth){
        super(length, breadth);
    }

    @Override
    double calculateArea(){
        return super.length * super.breadth;
    }
}

class Triangle extends Shape {
    Triangle(float base, float height){
        super(base, height);
    }

    @Override
    double calculateArea(){
        return 0.5 * super.base * super.height;
    }
}


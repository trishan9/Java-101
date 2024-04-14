package com.trishan.college.week7;

public class Task1 {
//    Write a Java program to create a class called "Circle" with a radius attribute.
//    You can access this attribute using setter and getter method. Calculate the area and circumference of the circle.

    public static void main(String[] args) {
        Circle circle1 = new Circle(2.5f);
        System.out.println(circle1.getRadius());
        circle1.setRadius(3.5f);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.area());
        System.out.println(circle1.circumference());
    }
}

class Circle {
    private float radius;
    public static final float PI = 3.14f;

    Circle(float radius){
        this.radius = radius;
    }

    float getRadius(){
        return this.radius;
    }

    void setRadius(float radius){
        this.radius = radius;
    }

    float area(){
        return this.radius * PI * PI;
    }

    float circumference(){
        return 2 * PI * this.radius ;
    }
}

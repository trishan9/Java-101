package com.trishan.college.week_10;

public class ClassTask {
  // You are building a shape hierarchy for a drawing application. Design an
  // abstract class named "Shape" with the
  // following abstract methods:
  //
  // calculateArea(): This method should calculate and return the area of the
  // shape.
  // calculatePerimeter(): This method should calculate and return the perimeter
  // of the shape.
  //
  // Implement the abstract class and provide concrete implementations for the
  // abstract methods. Create subclasses for
  // different shapes such as "Circle," "Rectangle," and "Triangle." Each subclass
  // should provide specific implementations
  // for calculating the area and perimeter of that shape. Create instances of
  // each shape class and demonstrate how
  // you can calculate their respective areas and perimeters.
  public static void main(String[] args) {
    Circle1 circ = new Circle1(4);
    Rectangle1 rect = new Rectangle1(4, 3);
    Triangle1 tri = new Triangle1(4, 4, 4, 4);

    System.out.println(circ.calculateArea());
    System.out.println(circ.calculatePerimeter());

    System.out.println(rect.calculateArea());
    System.out.println(rect.calculatePerimeter());

    System.out.println(tri.calculateArea());
    System.out.println(tri.calculatePerimeter());
  }
}

abstract class Shape1 {
  abstract double calculateArea();

  abstract double calculatePerimeter();
}

class Circle1 extends Shape1 {
  private final double radius;

  Circle1(double r) {
    this.radius = r;
  }

  @Override
  double calculateArea() {
    return Math.PI * (int) Math.pow(this.radius, 2);
  }

  @Override
  double calculatePerimeter() {
    return 2 * Math.PI * this.radius;
  }
}

class Rectangle1 extends Shape1 {
  private final double length;
  private final double breadth;

  Rectangle1(double l, double b) {
    this.length = l;
    this.breadth = b;
  }

  @Override
  double calculateArea() {
    return this.length * this.breadth;
  }

  @Override
  double calculatePerimeter() {
    return 2 * (this.length + this.breadth);
  }
}

class Triangle1 extends Shape1 {
  private final double base;
  private final double side1;
  private final double side2;
  private final double height;

  Triangle1(double b, double s1, double s2, double h) {
    this.base = b;
    this.side1 = s1;
    this.side2 = s2;
    this.height = h;
  }

  @Override
  double calculateArea() {
    return 0.5 * this.base * this.height;
  }

  @Override
  double calculatePerimeter() {
    return this.side1 + this.base + this.side2;
  }
}

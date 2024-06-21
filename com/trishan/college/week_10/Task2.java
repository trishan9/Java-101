package com.trishan.college.week_10;

import java.util.Scanner;

public class Task2 {
  // Create an abstract class called Shape with an abstract method called
  // calculateArea(). Implement two subclasses
  // called Rectangle and Circle that inherit from Shape. Override the
  // calculateArea() method in both subclasses to
  // calculate and return the area of a rectangle and a circle, respectively.
  // Write the Java code to implement this
  // scenario with Scanner Input.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter length: ");
    double l = sc.nextDouble();
    sc.nextLine();

    System.out.print("Enter breadth: ");
    double b = sc.nextDouble();
    sc.nextLine();

    Rectangle rect = new Rectangle(l, b);
    System.out.println(rect.calculateArea());

    System.out.print("Enter radius: ");
    double r = sc.nextDouble();
    sc.nextLine();

    Circle circ = new Circle(r);
    System.out.println(circ.calculateArea());
  }
}

abstract class Shape {
  abstract double calculateArea();
}

class Rectangle extends Shape {
  private double length;
  private double breadth;

  Rectangle(double l, double b) {
    this.length = l;
    this.breadth = b;
  }

  @Override
  double calculateArea() {
    return this.length * this.breadth;
  }
}

class Circle extends Shape {
  private double radius;

  Circle(double r) {
    this.radius = r;
  }

  @Override
  double calculateArea() {
    return Math.PI * this.radius * this.radius;
  }
}

package com.trishan.college.week_10;

public class Task5 {
  // You are building a shape hierarchy for a drawing application. Design an
  // abstract class named "Draw" with the
  // following abstract methods:
  // calculateVolume(): This method should calculate and return the volume of the
  // shape
  // calculateArea(): This method should calculate and return the area of the
  // shape.
  // calculatePerimeter(): This method should calculate and return the perimeter
  // of the shape.
  // Implement the abstract class and provide concrete implementations for the
  // abstract methods.
  // Create subclasses for different shapes such as "Cube," "Cuboid," and
  // "Cylinder." Each subclass should provide
  // specific implementations for calculating the volume, area and perimeter of
  // that shape. Create instances of each
  // shape class and demonstrate how you can calculate their respective volume,
  // areas and perimeters.
  public static void main(String[] args) {
    Cube cube = new Cube(5);
    Cuboid cuboid = new Cuboid(5, 3, 2);
    Cylinder cylinder = new Cylinder(5, 2);

    System.out.println(cube.calculateVolume());
    System.out.println(cube.calculateArea());
    System.out.println(cube.calculatePerimeter());

    System.out.println(cuboid.calculateVolume());
    System.out.println(cuboid.calculateArea());
    System.out.println(cuboid.calculatePerimeter());

    System.out.println(cylinder.calculateVolume());
    System.out.println(cylinder.calculateArea());
    System.out.println(cylinder.calculatePerimeter());
  }
}

abstract class Draw {
  protected double l;
  protected double b;
  protected double h;
  protected double r;

  // Cube
  Draw(double l) {
    this.l = l;
  }

  // Cuboid
  Draw(double l, double b, double h) {
    this.l = l;
    this.b = b;
    this.h = h;
  }

  // Cylinder
  Draw(double r, double h) {
    this.r = r;
    this.h = h;
  }

  abstract double calculateVolume();

  abstract double calculateArea();

  abstract double calculatePerimeter();
}

class Cube extends Draw {
  Cube(double l) {
    super(l);
  }

  @Override
  double calculateVolume() {
    return super.l * super.l * super.l;
  }

  @Override
  double calculateArea() {
    return 6 * super.l * super.l;
  }

  @Override
  double calculatePerimeter() {
    return 12 * super.l;
  }
}

class Cuboid extends Draw {
  Cuboid(double l, double b, double h) {
    super(l, b, h);
  }

  @Override
  double calculateVolume() {
    return super.l * super.b * super.h;
  }

  @Override
  double calculateArea() {
    return 2 * (super.l * super.h + super.l * super.b + super.h * super.b);
  }

  @Override
  double calculatePerimeter() {
    return 4 * (super.l + super.b + super.h);
  }
}

class Cylinder extends Draw {
  Cylinder(double r, double h) {
    super(r, h);
  }

  @Override
  double calculateVolume() {
    return Math.PI * super.r * super.r * super.h;
  }

  @Override
  double calculateArea() {
    return (2 * Math.PI * super.r * super.h) + (2 * Math.PI * super.r * super.r);
  }

  @Override
  double calculatePerimeter() {
    return (4 * super.r) + (2 * super.h);
  }
}

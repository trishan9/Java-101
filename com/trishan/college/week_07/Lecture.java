package com.trishan.college.week_07;

public class Lecture {
  public static void main(String[] args) {
    Person trishanObj = new Person();

    trishanObj.name = "Trishan";
    trishanObj.age = 18;
    trishanObj.gender = 'M';

    trishanObj.intro();

    Person albertObj = new Person("Albert Maharjan", 27, 'M');
    albertObj.intro();

    Person.hello();

    Square s1 = new Square();
    s1.sides = 10;
    int s1Area = s1.area();
    System.out.println(s1Area);
    s1.addSides(2);
    System.out.println(s1.area());

    Rectangle r1 = new Rectangle();
    r1.length = 3;
    r1.breadth = 5;

    System.out.println(r1.areaOfRectangle());
    System.out.println(r1.perimeterOfRectangle());

    Car car1 = new Car();
    car1.name = "X";
    car1.brand = "Tesla";
    car1.year = 2024;
    car1.color = "Silver";

    Car car2 = new Car();
    car2.name = "X1";
    car2.brand = "Tesla";
    car2.year = 2023;
    car2.color = "Golden";

    Car car3 = new Car();
    car3.name = "X2";
    car3.brand = "Tesla";
    car3.year = 2022;
    car3.color = "Black";

    car1.start();
    car2.start();
    car3.start();

    car1.stop();

    car2.modify("Green");

    System.out.println(car1.expiry());

    car1.detail();
    car1.detail();
    car3.detail();
  }
}

class Car {
  String name;
  String brand;
  int year;
  String color;

  void modify(String newColor) {
    this.color = newColor;
  }

  int expiry() {
    return this.year + 100;
  }

  void start() {
    System.out.println(this.name + " is starting");
  }

  void stop() {
    System.out.println(this.name + ", " + this.brand + " is stopping");
  }

  void detail() {
    System.out.printf("%s, %s, %s and %d\n", this.name, this.brand, this.color, this.year);
  }
}

class Person {
  String name;
  int age;
  char gender;

  Person() {

  }

  Person(String name, int age, char gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  void intro() {
    System.out.println("Hi my name is " + name);
  }

  static void hello() {
    System.out.println("Hello");
  }
}

class Square {
  int sides;

  int area() {
    int area = sides * sides;
    return area;
  }

  void addSides(int val) {
    sides = sides + val;
  }
}

// Task
class Rectangle {
  double length;
  double breadth;

  double areaOfRectangle() {
    return length * breadth;
  }

  double perimeterOfRectangle() {
    return 2 * (length + breadth);
  }
}

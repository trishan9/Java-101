package com.trishan.college.week_09;

public class InheritanceConstructor {
  public static void main(String[] args) {
    Polo p1 = new Polo();
    p1.differentColor("Yellow");

    Polo p2 = new Polo("Red");
    Polo p3 = new Polo(10);
  }
}

class Shirt {
  String color = "black";

  Shirt() {
    System.out.println("Making shirt");
  }

  Shirt(String color) {
    this.color = color;
  }
}

class Polo extends Shirt {
  String color = "white";
  String texture;

  Polo() {
    super("White");
    System.out.println("Making polo shirt");
  }

  Polo(String color) {
    this.color = color;
    System.out.println("Constructor with one string");
  }

  Polo(String color, String texture) {
    this.color = color;
    this.texture = texture;
    System.out.println("Constructor with two string");
  }

  Polo(int num) {
    System.out.println(num);
    System.out.println("Constructor with one int");
  }

  void differentColor(String color) {
    System.out.println("Param color: " + color);
    System.out.println("Class color: " + this.color);
    System.out.println("Parent color: " + super.color);
  }
}

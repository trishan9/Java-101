package com.trishan.oop.principles.encapsulation;

public class A {
  private int num;
  String name;
  int[] arr;

  // Access Modifiers/Specifiers
  // Public -> Everywhere
  // Private -> Only in it's associated class
  // Default -> In different package not allowed, in the same package allowed
  // Protected -> Subclasses only allowed

  public int getNum() {
    return this.num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  A(int num, String name) {
    this.num = num;
    this.name = name;
    this.arr = new int[num];
  }
}

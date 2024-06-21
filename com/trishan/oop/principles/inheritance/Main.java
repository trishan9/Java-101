package com.trishan.oop.principles.inheritance;

public class Main {
  // Inheritance: 'is-a' relationship, props and methods of
  // base/super/parent/generalised
  // class are passed on to a derived/sub/child/specialised class.

  // Types of Inheritance
  // Single, Multi-level, Hierarchial, Hybrid, Multiple (not supported, but is
  // possible through interfaces)

  public static void main(String[] args) {
    Dog bruno = new Dog("Dog", "Woof", 5, "Mammal", "Labrador");
    bruno.printDetails();
    bruno.bark();
  }
}

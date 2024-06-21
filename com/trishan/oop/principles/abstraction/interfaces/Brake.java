package com.trishan.oop.principles.abstraction.interfaces;

public interface Brake {
  void brake();

  default void brake2() { // default implementation - needs not to be implemented by subclasses.
    System.out.println("I am Brake 2!");
  }

  static void details() {
    System.out.println("I am brake!");
  };
}

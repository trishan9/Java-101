package com.trishan.oop.principles.abstraction;

public class Main {
  // Achieved via abstract classes and interfaces - process of gaining the
  // information
  // Abstract Classes (0 - 100%), Interface (100%)
  // Hiding all the unnecessary details and showing only the important parts to
  // the user.
  // Hiding implementation details, showing only the functionality.
  // lets you focus on what the object does instead of how it does it.

  // Abstract Classes - determines nature of the methods the subclass must
  // implement, just giving the definition of it, not the body.
  // - used for Abstraction and also used to achieve Multiple Inheritance with
  // interfaces.
  // Abstract Methods - Empty methods without implementation, child class needs to
  // override it in order to use it.
  // -> abstract void func(params);
  // Any class that contains one or more abstract methods, must be an abstract
  // class.

  // we can't instantiate an abstract class
  // can have abstract, non-abstract(static, default) methods
  // can have constructors

  public static void main(String[] args) {
    PetrolCar c1 = new PetrolCar("BMW", "X7");
    PetrolCar.greet(); // can't do c1.greet()
    c1.displayDetails();
    c1.startEngine("Hello World", 123);

    ElectricCar c2 = new ElectricCar("Tesla", "X");
    ElectricCar.greet();
    c2.displayDetails();
    c2.startEngine("Hello Tesla", 124);
  }
}

abstract class Car { // we can't create objects of an abstract class.
  String make;
  String model;

  Car(String make, String model) {
    this.make = make;
    this.model = model;
  }

  static void greet() {
    System.out.println("Hello, welcome to our car shop");
  }

  abstract void startEngine(String message, int messageId);

  abstract void displayDetails();
}

class PetrolCar extends Car {
  PetrolCar(String make, String model) {
    super(make, model);
  }

  @Override
  void startEngine(String message, int messageId) {
    System.out.println("Started Petrol Engine: " + message + " " + messageId);
  }

  @Override
  void displayDetails() {
    System.out.println("Details of the Petrol car:");
  }
}

class ElectricCar extends Car {
  ElectricCar(String make, String model) {
    super(make, model);
  }

  @Override
  void startEngine(String message, int messageId) {
    System.out.println("Started EV: " + message + " " + messageId);
  }

  @Override
  void displayDetails() {
    System.out.println("Details of the EV:");
  }
}

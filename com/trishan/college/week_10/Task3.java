package com.trishan.college.week_10;

public class Task3 {
  // Create an abstract class called Vehicle with abstract methods startEngine()
  // and stopEngine().
  // Implement two subclasses called Car and Motorcycle that inherit from Vehicle.
  // Implement the startEngine() and
  // stopEngine() methods in both subclasses to start and stop the engines of a
  // car and a motorcycle, respectively.
  public static void main(String[] args) {
    Car car = new Car();
    Motorcycle bike = new Motorcycle();

    car.startEngine();
    bike.startEngine();

    car.stopEngine();
    bike.stopEngine();
  }
}

abstract class Vehicle {
  abstract void startEngine();

  abstract void stopEngine();
}

class Car extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Car Engine started!");
  }

  @Override
  void stopEngine() {
    System.out.println("Car Engine stopped!");
  }
}

class Motorcycle extends Vehicle {
  @Override
  void startEngine() {
    System.out.println("Motorcycle Engine started!");
  }

  @Override
  void stopEngine() {
    System.out.println("Motorcycle Engine stopped!");
  }
}

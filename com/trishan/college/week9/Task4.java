package com.trishan.college.week9;

public class Task4 {
//    Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()'
//    and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in
//    'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the
//    relevant methods for a car and a motorcycle object.
    public static void main(String[] args) {
        Car2 car = new Car2("BMW", "X7", 123);
        Motorcycle bike = new Motorcycle("Royal Enfield", "Hunter", 123);

        car.startEngine();
        car.drive();
        car.stopEngine();

        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}

class Vehicle2 {
    private final String make;
    private final String model;
    private float price;

    Vehicle2(String make, String model, float price) {
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void startEngine() {
        System.out.println("Engine has been started!");
    }

    public void stopEngine() {
        System.out.println("Engine has been stopped!");
    }
}

class Car2 extends Vehicle2 {
    Car2(String make, String model, float price) {
        super(make, model, price);
    }

    void drive() {
        System.out.println("Driving the car!");
    }
}


class Motorcycle extends Vehicle2 {
    Motorcycle(String make, String model, float price) {
        super(make, model, price);
    }

    void ride() {
        System.out.println("Riding the motorcycle!");
    }
}


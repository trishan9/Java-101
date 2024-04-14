package com.trishan.college.week9;

class Task1 {
//    Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car
//    with method display() method to print details of the Car.
    public static void main(String[] args) {
        Car car1 = new Car("Ford", "Raptor", 999.99f);
        car1.display();
        car1.drive();
    }
}

class Vehicle {
    public void drive(){
        System.out.println("Driving the vehicle");
    }
}

class Car extends Vehicle {
    private final String make;
    private final String model;
    private float price;

    Car(String make, String model, float price){
        this.make = make;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.printf("Car Details:!\nCar Make: %s, Car Model: %s, Car Price: %.2f\n", this.make, this.model, this.price);
    }
}

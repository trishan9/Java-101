package com.trishan.oop.programs.collegeweek8;

public class Task5 {
//    You are designing a car rental system, and you need to create a Car class. The Car class should have private
//    instance variables for the car's make, model, and rental price per day. Implement appropriate getter and setter
//    methods for these variables, ensuring that the make and model can only be set once during object creation.
//    Additionally, include a private variable to track the availability of the car (e.g., true if available for rent,
//    false if rented), and provide public methods to rent and return the car, updating its availability status.
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "X7", 9999.f);
        car1.setRentalPrice(99999.99f);
        System.out.println(car1.getMake() + " " + car1.getModel());
        car1.rentCar();
        car1.rentCar();
        car1.returnCar();

        Car car2 = new Car("Ford", "Ranger", 12345f);
        car2.returnCar();
    }
}

class Car {
    private final String make;
    private final String model;
    private float rentalPrice;
    private boolean isCarAvailable;

    Car(String make, String model, float rentalPrice){
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.isCarAvailable = true;
    }

    public void setRentalPrice(float newPrice) {
        this.rentalPrice = newPrice;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    public float getRentalPrice(){
        return this.rentalPrice;
    }

    public void rentCar(){
        if(this.isCarAvailable){
            System.out.printf("Car rented successfully!\nRent Per Day: %.2f, Car Make: %s, Car Model: %s\n", this.getRentalPrice(), this.getMake(), this.getModel());
            this.isCarAvailable = false;
        } else {
            System.out.println("Sorry, the car is not available for rent!");
        }
    }

    public void returnCar(){
        if(!this.isCarAvailable){
            System.out.println("Car returned successfully!");
            this.isCarAvailable = true;
        } else {
            System.out.println("Car that has not been rented can't be returned!");
        }
    }
}
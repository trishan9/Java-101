package com.trishan.oop.programs.collegeweek7;

public class Task3 {
//    Write a Java program to create a class called "Dog" with a name and breed attribute.
//    Create two instances of the "Dog" class, set their attributes using the constructor and modify the attributes using
//    the setter methods and print the updated values.
    public static void main(String[] args) {
        Dog dog1 = new Dog("Bro", "Labrador");
        Dog dog2 = new Dog("Tom", "Siberian Husky");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());

        dog1.setName("Bruno");
        dog2.setName("Tommy");

        System.out.println(dog1.getName());
        System.out.println(dog2.getName());
    }
}

class Dog {
    private String name;
    private String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getBreed() {
        return this.breed;
    }
}

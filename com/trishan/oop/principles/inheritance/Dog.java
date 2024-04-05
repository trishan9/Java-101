package com.trishan.oop.principles.inheritance;

public class Dog extends Animal {
    String breed;

    Dog(String name, String sound, int age, String type, String breed) {
        super(name, sound, age, type);
        this.breed = breed;
    }

    public void bark() {
        System.out.println("Woof! " + super.name);
    }
}

package com.trishan.college.week10;

public class Task1 {
//    Create an abstract class called Animal with an abstract method called sound(). Implement two subclasses called
//    Dog and Cat that inherit from Animal. Override the sound() method in both subclasses to display the specific sound
//    made by each animal. Write the Java code to implement this scenario.
    public static void main(String[] args) {
        Dog bruno = new Dog();
        Cat tom = new Cat();
        bruno.sound();
        tom.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("woof!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("meow!");
    }
}
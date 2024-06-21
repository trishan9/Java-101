package com.trishan.oop.principles.inheritance;

public class Animal {
  String name;
  String sound;
  int age;
  String type;
  private int a = 10;

  public Animal(String name, String sound, int age, String type) {
    this.name = name;
    this.sound = sound;
    this.age = age;
    this.type = type;
  }

  public void printDetails() {
    System.out.println("Name: " + this.name + " Age: " + this.age);
  }
}

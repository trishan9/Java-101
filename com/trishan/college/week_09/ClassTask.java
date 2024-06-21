package com.trishan.college.week_09;

public class ClassTask {
  public static void main(String[] args) {
    Labrador lab1 = new Labrador();
    lab1.name = "Nischay";
    lab1.breed = "Labrador";
    lab1.country = "United Kingdom";
    lab1.color = "Cream";

    lab1.speaks();
    lab1.fur();
    lab1.barks();
    lab1.play();
  }
}

class Animal {
  String name;

  void speaks() {
    System.out.println(name + " Speaks");
  }
}

class Mammal extends Animal {
  String breed;

  void fur() {
    System.out.println(breed + " Furrrrrr!!!");
  }
}

class Reptile extends Animal {
  String eggs;

  void sheds() {
    System.out.println(eggs + " Sheds!!!");
  }
}

class DogClass extends Mammal {
  String country;

  void barks() {
    System.out.println(country + " Barks!!!");
  }
}

class Cat extends Mammal {
  String origin;

  void meows() {
    System.out.println(origin + " Meowww!!!");
  }
}

class Amphibian extends Reptile {
  String scale;

  void swims() {
    System.out.println(scale + " Swims!!!");
  }
}

class Labrador extends DogClass {
  String color;

  void play() {
    System.out.println(color + " Plays!!!");
  }
}

class GermanShepherd extends DogClass {
  String spot;

  void guard() {
    System.out.println(spot + " Guard!!!");
  }
}

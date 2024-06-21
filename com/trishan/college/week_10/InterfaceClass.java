package com.trishan.college.week_10;

public class InterfaceClass {
  public static void main(String[] args) {

  }
}

interface AnimalDo {
  public void move();

  public boolean eat(String food);

  default void walk() {
    System.out.println("hello");
  }
}

interface MammalDo extends AnimalDo {
  public int legs();
}

interface DogDo extends MammalDo {
  public void bark();
}

interface DomesticAnimalDo {
  public void pet();
}

class Husky implements DogDo, DomesticAnimalDo {
  public void move() {
    System.out.println("Husky moves fast");
  }

  @Override
  public boolean eat(String food) {
    System.out.println("Husky eat fish");
    return false;
  }

  @Override
  public int legs() {
    return 3;
  }

  @Override
  public void bark() {
    System.out.println("Woof");
  }

  @Override
  public void pet(){
    System.out.println("Husky likes pet");
  }
}

class Wolf implements AnimalDo {
  @Override
  public void move() {
    System.out.println("Wolf moves fast");
  }

  @Override
  public boolean eat(String food) {
    System.out.println("Wolf eat meat");
    return false;
  }
}

class Cow implements AnimalDo {
  @Override
  public void move() {
    System.out.println("Cow moves slow");
  }

  @Override
  public boolean eat(String food) {
    System.out.println("Cow eat grass");
    return true;
  }
}

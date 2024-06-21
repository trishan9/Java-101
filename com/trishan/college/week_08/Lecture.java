package com.trishan.college.week_08;

public class Lecture {
  public static void main(String[] args) {
    Laptop laptop1 = new Laptop("Apple", "Apple Air M3");

    laptop1.setYear(2023);
    laptop1.setPrice(10000);
    laptop1.inflation(50000);
    laptop1.setRam(8);
    laptop1.setStorage(128);
    laptop1.upgrade(2, 128);

    System.out.println("Brand: " + laptop1.brand);
    System.out.println("Name: " + laptop1.name);
    System.out.println("Price: " + laptop1.getPrice());
    System.out.println("Ram: " + laptop1.getRam());
    System.out.println("Storage: " + laptop1.getStorage());
    System.out.println("Year: " + laptop1.getYear());
  }
}

class Laptop {
  String brand;
  String name;
  private double price;
  private int ram;
  private int storage;
  private int year;

  Laptop(String brand, String name) {
    this.brand = brand;
    this.name = name;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  public void setRam(int ram) {
    this.ram = ram;
  }

  public int getRam() {
    return this.ram;
  }

  public void setStorage(int storage) {
    this.storage = storage;
  }

  public int getStorage() {
    return this.storage;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getYear() {
    return this.year;
  }

  public void upgrade(int ram, int storage) {
    this.ram += ram;
    this.storage += storage;
  }

  public void inflation(int price) {
    this.price += price;
  }
}

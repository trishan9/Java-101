package com.trishan.college.week_09;

public class Lecture {
  public static void main(String[] args) {
    GrandChildClass cc = new GrandChildClass();
    cc.firstname = "XYZ";
    cc.lastname = "ANC";
    cc.expenses = 100.11;
    cc.setSalary(10000);
    cc.info();
    cc.detail();
    cc.description();
  }
}

class ParentClass {
  public String lastname;
  private int salary;
  protected double expenses;

  ParentClass() {
    System.out.println("I am parent constructor");
  }

  void info() {
    System.out.println("Parent Function " + lastname);
  }

  void setSalary(int salary) {
    this.salary = salary;
  }
}

// Single Inheritance
class ChildClass extends ParentClass {
  String firstname;

  ChildClass() {
    System.out.println("I am child constructor");
  }

  void detail() {
    System.out.println(firstname + " " + lastname);
  }
}

// Multi-level Inheritance
class GrandChildClass extends ChildClass {
  String middlename;

  GrandChildClass() {
    System.out.println("I am grand child constructor");
  }

  void description() {
    System.out.println(firstname + " " + middlename + " " + lastname);
  }
}

// Tree/Hierarchial Inheritance
class SisterChildClass extends ParentClass {
  String address;

  void living() {
    System.out.println(lastname + " " + address);
  }
}

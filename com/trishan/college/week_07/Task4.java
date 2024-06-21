package com.trishan.college.week_07;

public class Task4 {
  // Write a Java program to create a class called "Employee" with a name, job
  // title, and salary attributes,
  // and methods to calculate and update salary.
  public static void main(String[] args) {
    Employee emp1 = new Employee("Trishan", "Software Engineer", 999999.999);
    System.out.println(emp1.getSalary());
    emp1.updateSalary(1111111.1112);
    System.out.println(emp1.getSalary());
  }
}

class Employee {
  private String name;
  private String title;
  private double salary;

  Employee(String name, String title, double salary) {
    this.name = name;
    this.title = title;
    this.salary = salary;
  }

  void updateSalary(double salary) {
    this.salary = salary;
  }

  double getSalary() {
    return this.salary;
  }
}

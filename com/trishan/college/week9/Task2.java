package com.trishan.college.week9;

public class Task2 {
//    Write a Java program to create a class called Employee with methods called work() and getSalary().
//    Create a subclass called HRManager that overrides the work() method.
    public static void main(String[] args) {
        HRManager emp1 = new HRManager("Trishan", 99911.9f);
        System.out.println(emp1.getSalary());
        emp1.work();
    }
}

class Employee {
    private String name;
    private String role;
    private String department;
    private float salary;

    Employee(String name, String role, String department, float salary){
        this.name = name;
        this.role = role;
        this.department = department;
        this.salary = salary;
    }

    public void work() {
        System.out.println("Working as an employee!");
    }

    public float getSalary(){
        return this.salary;
    }
}

class HRManager extends Employee {
    HRManager(String name, float salary) {
        super(name, "HR Manager", "Human Resource Management", salary);
    }

    @Override
    public void work() {
        System.out.println("Working as an HR Manager!");
    }
}

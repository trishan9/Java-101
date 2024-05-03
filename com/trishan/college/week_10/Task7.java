package com.trishan.college.week_10;

public class Task7 {
//    You are developing a restaurant management system that handles different types of employees, such as chefs and
//    waiters. Design an interface named "Employee" with the following methods:
//    work(): This method should define the work responsibilities of the employee.
//    getSalary(): This method should return the salary of the employee.
    public static void main(String[] args) {
        Chef e1 = new Chef();
        Waiter e2 = new Waiter();

        e1.work();
        e2.work();

        System.out.println(e1.getSalary());
        System.out.println(e2.getSalary());
    }
}

interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Working as a chef!");
    }

    @Override
    public double getSalary() {
        return 200000;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Working as a waiter!");
    }

    @Override
    public double getSalary() {
        return 20000;
    }
}
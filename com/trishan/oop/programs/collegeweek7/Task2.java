package com.trishan.oop.programs.collegeweek7;

public class Task2 {
//    Write a Java program to create a class called “Simple Interest” with a data fields principle, time and rate,
//    using setter getter method and print the values.
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest(10000, 2, 5);
        si.setRate(10);
        System.out.println("Principle: " + si.getPrinciple());
        System.out.println("Time: " + si.getTime() + " years");
        System.out.println("Rate: " + si.getRate() + "%");
    }
}

class SimpleInterest {
    private double principle;
    private double time;
    private double rate;

    SimpleInterest(double principle, double time, double rate) {
        this.principle = principle;
        this.time = time;
        this.rate = rate;
    }

    // Setters
    public void setPrinciple(double principle) {
        this.principle = principle;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // Getters
    public double getPrinciple() {
        return principle;
    }

    public double getTime() {
        return time;
    }

    public double getRate() {
        return rate;
    }
}

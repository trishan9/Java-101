package com.trishan.oop.programs.collegeweek8;

public class Task3 {
//    You are working on a student information system and need to create a Student class. The student class should have
//    private instance variables for the student's name, ID number, and grade point average (GPA).
//    Implement getter and setter methods for the name and ID number, ensuring that they can be accessed and modified only
//    through these methods. However, the GPA should be read-only and can only be set within the class constructor.

    public static void main(String[] args) {
        Student trishan = new Student("Trishan Wagle", 12345, 3.85f);
        trishan.setName("Trisan Wagle");
        trishan.setStudentId(112345);
        System.out.println(trishan.getName() + " " + trishan.getStudentId() + " " + trishan.getGpa());
    }
}

class Student {
    private String name;
    private int studentId;
    private final float gpa;

    Student(String name, int studentId, float gpa){
        this.name = name;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public String getName(){
        return this.name;
    }

    public int getStudentId(){
        return this.studentId;
    }

    public float getGpa(){
        return this.gpa;
    }
}
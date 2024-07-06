package com.trishan.college.exam_practice_questions.section_d;

public class Task1 {
  public static void main(String[] args) {
    Student s1 = new Student("230352", "Trishan Wagle", 3.85f);
    Student s2 = new Student("230353", "Albert Maharjan");
    s1.printProfile();
    s1.updateGpa(3.87f);
    s1.printProfile();
    s2.printProfile();
  }
}

class Student {
  final private String studentId;
  private String studentName;
  private float gpa;

  // Constructor w/o student's GPA
  Student(String studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  Student(String studentId, String studentName, float gpa) {
    this.studentId = studentId;
    this.studentName = studentName;
    this.gpa = gpa;
  }

  public void updateGpa(float newGpa) {
    this.gpa = newGpa;
  }

  public void printProfile() {
    System.out.printf("\nStudent ID: %s\nStudent Name: %s\nStudent's GPA: %.2f\n", this.studentId, this.studentName,
        this.gpa);
  }
}

package com.school;

public class Student {
    private static int studentIdCounter = 1;

    int studentId;
    String name;

    public Student(String studentName) {
        this.studentId = studentIdCounter++;
        this.name = studentName;
    }

    public int getStudentId() {
        return studentId;
    }   

    public String getName() {
        return name;
    }

    // public void setDetails(int id, String studentName) {
    //     this.studentId = id; // using 'this' for clarity
    //     this.name = studentName;
    // }

    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
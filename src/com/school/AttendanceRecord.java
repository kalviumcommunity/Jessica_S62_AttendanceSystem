package com.school;

public class AttendanceRecord {
    private int studentId;
    private int courseId;
    private String status;

    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        if ("Present".equalsIgnoreCase(status) || "Absent".equalsIgnoreCase(status)) {
            this.status = status;
        } 
        else {
            this.status = "Invalid";
            System.out.println("Invalid attendance status. Please enter 'Present' or 'Absent'.");
        }
    }
    public int getStudentId() {return studentId;}

    public int getCourseId() {return courseId;}

    public String getStatus() {return status;}

    public void displayDetails() {
        System.out.println("Attendance Record - Student ID: " + studentId +", Course ID: " + courseId +", Status: " + status);
    }
}
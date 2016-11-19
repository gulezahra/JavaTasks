package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Student {

    private String name;
    private String address;
    private int rollNo;
    private double GPA;
    private Course[] course;

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public void setName(String abc) {
        name = abc;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String add) {
        address = add;
    }

    public String getAddress() {
        return address;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public Student(String name, String address, int rollNo, double GPA) {
        this.name = name;
        this.address = address;
        this.rollNo = rollNo;
        this.GPA = GPA;
    }

    /*public void printDetails (Student[] students) {
        String studentName = getName();
        String studentAddress = getAddress();
        int studentRollNo = getRollNo();
        double studentGPA = getGPA();
    }*/
}
package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Student extends Course {

    private int rollNo;
    private double GPA;

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

    public void printDetails (Student[] students) {
        String studentName = getName();
        String studentAddress = getAddress();
        int studentRollNo = getRollNo();
        double studentGPA = getGPA();
            System.out.println("Student's name: " + studentName);
            System.out.println("Address: " + studentAddress);
            System.out.println("Roll No.: " + studentRollNo);
            System.out.println("GPA: " + studentGPA);
            System.out.println();
    }
}

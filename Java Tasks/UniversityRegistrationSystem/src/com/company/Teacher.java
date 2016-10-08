package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Teacher extends Course {

    private int telephoneNo;
    private String degree;

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public void printDetails (String nameOfCourse, Teacher teacher) {
        String teacherName = getName();
        String teacherAddress = getAddress();
        int teacherTelephoneNo = getTelephoneNo();
        String teacherDegree = getDegree();
        System.out.println("Course Name = " + nameOfCourse + "\n");
        System.out.println("Teacher assigned to conduct the course :-\n\nTeacher's name: " + teacherName);
        System.out.println("Address: " + teacherAddress);
        System.out.println("Telephone No.: " + teacherTelephoneNo);
        System.out.println("Degree : " + teacherDegree);
    }
}
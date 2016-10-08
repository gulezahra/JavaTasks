package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Course {

    public int count = 0;
    private String name;
    private String address;
    private Student[] students;
    private Teacher teacher;

    public void setName (String abc) {
        name = abc;
    }

    public String getName () {
        return name;
    }

    public void setAddress (String add) {
        address = add;
    }

    public String getAddress () {
        return address;
    }

    public void setStudents(Student[] students) {
        this.students = students(count);
        count++;
    }

    public Student[] students(int count) {
        students = new Student[count++];
        return this.students;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void printDetails(Student[] s, Teacher t) {
        System.out.println("Students enrolled in the course = " + s);
        System.out.println("Teacher assigned to conduct the course = " + t);
    }
}
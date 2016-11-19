package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Course {

    private Student[] students;
    private Teacher teacher;
    private String courseName;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setStudents(Student[] students) {
        this.students = students;
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

    public void printDetails() {
        //System.out.println(students.length);
        System.out.println("Students enrolled in the course: \n");
        for (int i = 0; i < students.length; i++) {
            //System.out.println(students[i]+"");
            System.out.println("Name: " + students[i].getName());
            System.out.println("Roll No.: " + students[i].getRollNo());
            System.out.println("Address: " + students[i].getAddress());
            System.out.println("GPA: " + students[i].getGPA());
            if (students[i].getCourse().length > 0) {
                for (int j = 0; j < students[i].getCourse().length; j++) {
                    System.out.println("Courses enrolled in: " + students[i].getCourse()[j].getCourseName());
                }
            }
            System.out.println();
        }
        System.out.println("Teacher assigned to conduct the course: \nName: " + teacher.getName());
        System.out.println("Address: " + teacher.getAddress());
        System.out.println("Telephone No.: " + teacher.getTelephoneNo());
        System.out.println("Degree: " + teacher.getDegree());
    }
}
package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Course[] courseArray = new Course[5];
        for (int j = 0; j < courseArray.length; j++) {
            courseArray[j] = new Course();
            int a = (int) (217 + (Math.pow(j, 4)));
            courseArray[j].setCourseName("Course Code [" + a + "]");
        }
        Student[] student = new Student[5];

        student[0] = new Student("Ibrahim", "RYK", 144, 4.0);
        student[0].setCourse(courseArray);
        student[1] = new Student("Zain", "Lahore", 130, 3.7);
        student[1].setCourse(courseArray);
        student[2] = new Student("Shoaib", "Quetta", 179, 4.0);
        student[2].setCourse(courseArray);
        student[3] = new Student("Haroon", "Karachi", 168, 3.0);
        student[3].setCourse(courseArray);
        student[4] = new Student("Ali", "Karachi", 121, 3.5);
        student[4].setCourse(courseArray);

        Teacher teacher = new Teacher("Atif", "Murree", 4569731, "Ph.D");

        Course course = new Course();

//        Student[] students = course.getStudents();
        course.setStudents(student);
//        Teacher teacher1 = course.getTeacher();
        course.setTeacher(teacher);

        course.printDetails();
    }
}
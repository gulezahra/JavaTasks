package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student sArr[] = new Student[5];

        sArr[0] = new Student();
        sArr[0].setName("Ali");
        sArr[0].setAddress("#25, Block C, Shah Faisal Town, Karachi");
        sArr[0].setRollNo(118);
        sArr[0].setGPA(3.01);

        sArr[1] = new Student();
        sArr[1].setName("Amir");
        sArr[1].setAddress("#20, Block C, Shahra e Faisal, Karachi");
        sArr[1].setRollNo(170);
        sArr[1].setGPA(3.23);

        sArr[2] = new Student();
        sArr[2].setName("Atif");
        sArr[2].setAddress("#10, Block A, DHA Phase 6, Karachi");
        sArr[2].setRollNo(172);
        sArr[2].setGPA(3.3);

        sArr[3] = new Student();
        sArr[3].setName("Abid");
        sArr[3].setAddress("#39, Block E, Model Colony, Karachi");
        sArr[3].setRollNo(163);
        sArr[3].setGPA(3.5);

        sArr[4] = new Student();
        sArr[4].setName("Aryan");
        sArr[4].setAddress("#295, Block C, Goth Natke Khan, Karachi");
        sArr[4].setRollNo(140);
        sArr[4].setGPA(3.9);

        Teacher t1 = new Teacher();
        t1.setName("Zeeshan Hanif");
        t1.setAddress("#30, Block D, Malir Cantt, Karachi");
        t1.setTelephoneNo(34681349);
        t1.setDegree("B.S. Computer Science");

        t1.printDetails("Android Development" , t1);
        System.out.println("");
        System.out.println("Students enrolled in the course :- \n");

        sArr[0].printDetails(sArr);
        sArr[1].printDetails(sArr);
        sArr[2].printDetails(sArr);
        sArr[3].printDetails(sArr);
        sArr[4].printDetails(sArr);

        /**
        Course android = new Course();
        android.setStudents(sArr);
        Student[] studentCourse = android.getStudents();
        android.setTeacher(t1);
        Teacher teacherCourse = android.getTeacher();

        android.printDetails(studentCourse, teacherCourse);
        */
    }
}
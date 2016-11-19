package com.company;

/**
 * Created by gulezahra on 10/7/2016.
 */
public class Teacher extends Course {

    private String name;
    private String address;
    private int telephoneNo;
    private String degree;


    public Teacher(String name, String address, int telephoneNo, String degree) {
        this.name = name;
        this.address = address;
        this.telephoneNo = telephoneNo;
        this.degree = degree;
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

    /*public void printDetails(String nameOfCourse, Teacher teacher) {
        String teacherName = getName();
        String teacherAddress = getAddress();
        int teacherTelephoneNo = getTelephoneNo();
        String teacherDegree = getDegree();
    }*/
}
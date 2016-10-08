package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public class AddNumberClass {

    public float addNumbers (int num1, float num2) {
        float num3  = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
        return num3;
    }

    public float addNumbers (float num1, int num2) {
        float num3  = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
        return num3;
    }

    public int addNumbers (int num1, int num2) {
        int num3  = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + num3);
        return num3;
    }

}

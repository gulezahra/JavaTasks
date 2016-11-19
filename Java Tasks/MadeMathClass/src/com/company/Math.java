package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public class Math {
    public int num1;
    public int num2;
    public double num3;

    //If we made these methods static, then no need to make object for math class and can call these methods...
    public int min (int num1, int num2) {
        return num1 < num2 ? num1 : num2 ;
    }

    public int max (int num1, int num2) {
        return num1 > num2 ? num1 : num2 ;
    }

    // If num is -ve then it is made +ve through this absolute method
    public double abs (double num3) {
        return (num3 <= 0.0) ? -num3 : num3;
    }

    // Ceiling method without using Math class
    // if num2 = 4.1 --> 4.1*10 = 41 --> 41+10.0 = 51.0 --> 51.0/10 = 5.1 --> then cast to int --> num = 5 ...
    public int ceil (double num3) {
        int num = (int) ((num3 * 10) + 10.0 ) / 10;
        return num;
    }
}

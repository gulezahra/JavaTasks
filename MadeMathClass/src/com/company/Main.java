package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Math myMath = new Math();
        System.out.println("Minimum no. : " + myMath.min(4,2));
        System.out.println("Maximum no. : " + myMath.max(6,3));
        System.out.println("Absolute : " + myMath.abs(-3.4));
        System.out.println("Ceil : " + myMath.ceil(4.3));
    }
}

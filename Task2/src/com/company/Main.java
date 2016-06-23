package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 10;
        int b = 12;

        int c = a++ + --b + ++a + --b;
        System.out.println("Answer is " + c);
    }
}

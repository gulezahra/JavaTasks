package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Distance d1 = new Distance(50.5, 120);
        Distance d2 = new Distance(50.5, 120);

        // Don't understand the method how to compare two objects...
        System.out.println(d1.equals(d2));

        d1.display();
        d2.display();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c,d,e;
        c = 9;
        e = 1;
        for (a = 7; a > 0; a--) {
            for (b = c -= 2; b > 0; b--) {
                System.out.print(" * ");
            }
            System.out.println("");
            for (d = e; d > 0; d--)
                System.out.print("   ");
            e += 1;
        }
    }
}

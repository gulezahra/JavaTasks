package com.company;

/**
 * Created by gulezahra on 6/16/2016.
 */
public class Main2 {
    public static void main(String[] args) {
        // write your code here
        int a1, b1, c1, d1, e1, a2, b2, c2, d2, e2;
        c1 = -1;
        e1 = 3;
        for (a1 = 3; a1 > 0; a1--) {
            for (d1 = e1; d1 > 0; d1--)
                System.out.print("   ");
            e1 -= 1;
            for (b1 = c1 += 2; b1 > 0; b1--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        c2 = 9;
        e2 = 1;
        for (a2 = 7; a2 > 0; a2--) {
            for (b2 = c2 -= 2; b2 > 0; b2--) {
                System.out.print(" * ");
            }
            System.out.println("");
            for (d2 = e2; d2 > 0; d2--)
                System.out.print("   ");
            e2 += 1;
        }
    }
}
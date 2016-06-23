package com.company;

/**
 * Created by gulezahra on 6/16/2016.
 */
public class Main1
{
    public static void main(String[] args) {
        // write your code here
        int a,b,c,d,e;
        c = -1;
        e = 3;
        for (a = 4; a > 0; a--) {
            for (d = e; d > 0; d--)
                System.out.print("   ");
            e -= 1;
            for (b = c += 2; b > 0; b--) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
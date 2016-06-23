package com.example.CheckingFor;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by gulezahra on 6/10/2016.
 */
public class ToCheck {
    public static void main(String[] args){
        int num1 = 42; // 00101010
        int num2 = 15; // 00001111
        System.out.println("AND Result = " +(num1 & num2));
        System.out.println("OR Result = " +(num1 | num2));
        System.out.println("XOR Result = " +(num1 ^ num2));
    }
}

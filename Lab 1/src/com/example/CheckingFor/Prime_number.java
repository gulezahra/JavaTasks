package com.example.CheckingFor;
import java.util.*;
/**
 * Created by gulezahra on 6/11/2016.
 */
public class Prime_number {
    public static void main(String[] args) {
        int num = 2, count = 0;
        for (int i = 4; i <= num / 2; i++) {
            if (num % i == 0) {
                count++;
                break;
            }
        }
            if (count == 0 && num != 1)
                System.out.println(num + " is a prime number");
            else
                System.out.println(num + " is not a prime number");

        }
}
package com.company;

/**
 * Created by gulezahra on 6/18/2016.
 */
public class Assihn_prime {
    public static void main(String[] args) {
        // write your code here
        int number = 7;
        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                //not prime
                //System.out.println("Not prime");
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

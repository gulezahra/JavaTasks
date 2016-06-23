package com.company;

/**
 * Created by gulezahra on 6/11/2016.
 */
public class Task3 {
    public static void main(String args[]) {
        String PrimeNumber = "";
        boolean isPrime;
        for (int number = 1; number <= 100; number++) {
            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                PrimeNumber = PrimeNumber + " " + number;
            }
        }
        System.out.println("Prime Numbers from 1 to 100 are:");
        System.out.println(PrimeNumber);
    }
}
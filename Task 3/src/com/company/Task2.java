package com.company;

/**
 * Created by gulezahra on 6/11/2016.
 */
public class Task2 {
    public static void main (String args[]) {
        int numbers_exactly_div = 0;
        int b;
        for (b =  1; b <= 100; b++) {
            if (b%2 == 0){
                numbers_exactly_div = numbers_exactly_div + 1;
                System.out.println(b + ", \r");
            }
            else {
                numbers_exactly_div = numbers_exactly_div;
            }
        }
        System.out.println("Numbers between 1 to 100 that are exactly divisible by 2 are = " + numbers_exactly_div);
    }
}

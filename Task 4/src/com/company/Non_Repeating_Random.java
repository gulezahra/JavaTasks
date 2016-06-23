package com.company;
import java.util.Random;

/**
 * Created by gulezahra on 6/16/2016.
 */
public class Non_Repeating_Random {
    public static void main(String[] args) {
        int a[] = new int[5];
        Random r = new Random();
        boolean isMatched;

        for (int i = 0; i < a.length; i++) {
            isMatched = false;
            a[i] = r.nextInt(6);
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    isMatched = true;
                    break;
                }
            }
            if (isMatched) {
                i--;
            }
        }
        System.out.println("NON-REPEATING RANDOM NUMBERS IN THE RANGE OF 6: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
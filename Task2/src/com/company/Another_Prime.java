package com.company;
import java.util.*;
/**
 * Created by gulezahra on 6/11/2016.
 */
public class Another_Prime {
    public static void main(String args[]) {
        int a = 1;
        while (a == 1) {
            float b = 1;
            Scanner s = new Scanner(System.in);
            System.out.print("Please enter a number = ");
            float c = s.nextFloat();

            for (float d = 2; d <= c - 1; d++) {
                float e = c / d;
                for (float g = 1; g <= c; g++) {
                    if (e == g) {
                        System.out.println(c + " is not a Prime Number");
                        b = 0;
                        break;
                    }
                }
                if (b == 0)
                    break;
            }

            if (b != 0) {
                System.out.println(c + " is a Prime Number");
            }
            System.out.println("Enter 'q' to quit or any other key to continue");
            char h = s.next().charAt(0);
            if (h == 'q')
                break;
        }
    }
}
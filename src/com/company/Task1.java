package com.company;
import java.util.Random;
/**
 * Created by gulezahra on 6/18/2016.
 */
public class Task1 {
    public static void main(String[] args) {
        Random a = new Random();
        for (int i = 1; i <= 100; i++) {
            char b = (char) (a.nextInt(25) + 65);
            if (b == 'A') {
                System.out.print(b +" is a vowel\n");
            }
            else if (b == 'E') {
                System.out.print(b +" is a vowel\n");
            }
            else if (b == 'I') {
                System.out.print(b +" is a vowel\n");
            }
            else if (b == 'O') {
                System.out.print(b +" is a vowel\n");
            }
            else if (b == 'U') {
                System.out.print(b +" is a vowel\n");
            }
        }
    }
}

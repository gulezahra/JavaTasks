package com.company;
import java.util.Random;
/**
 * Created by gulezahra on 6/16/2016.
 */
public class Assign2 {
    public static void main(String[] args) {
        Random a = new Random();
        for (int i = 1; i <= 7; i++) {
            char b = (char) (a.nextInt(25) + 65);
            System.out.print(b);
            switch (b) {
                case 'A':
                    System.out.print(" = It is a vowel");
                    break;
                case 'E':
                    System.out.print(" = It is a vowel");
                    break;
                case 'I':
                    System.out.print(" = It is a vowel");
                    break;
                case 'O':
                    System.out.print(" = It is a vowel");
                    break;
                case 'U':
                    System.out.print(" = It is a vowel");
                    break;
                default:
                    System.out.print(" = It is a consonant");
            }
            System.out.println();
        }
    }
}

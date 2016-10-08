package com.company;
import java.util.Scanner;

/**
 * Created by gulezahra on 7/15/2016.
 */
public class IdentifySameCharacter {
    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String Word = scan.nextLine();
        System.out.println("Enter the letter for which no.of occurrence is to check : ");
        char Letter = scan.findInLine(".").charAt(0);
        int count = 0;

        for (int i = 0; i < Word.length(); i++) {
            if ( Word.charAt(i) == Letter) {
                count++;
            }
        }
        System.out.println("Letter " + Letter + " is present " + count + " times in your sentence.");
    }
}

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String Word = scan.nextLine();
        System.out.println("Enter the letter for which no.of occurrence is to check : ");
        String Letter = scan.next();

        int count = -1, index = 0, position = -1;

        while (index >= 0) {
            index = Word.indexOf(Letter, position + 1);
            count++;
            position = index;
        }
        System.out.println("Letter " + Letter + " is present " + count + " times in your Sentence");
    }
}

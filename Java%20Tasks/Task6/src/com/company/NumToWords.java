package com.company;
import java.util.Scanner;

/**
 * Created by gulezahra on 7/2/2016.
 */
public class NumToWords {
    public static void main(String[] args) {
        String ones[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String teens[] = {"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String tens[] = {"ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "hundred"};
        int value, value1, value2, value3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 999");
        int num = scan.nextInt();

        if (num <= 9) {
            value = num % 10;
            System.out.println("The number is " + ones[value]);
        }
        else if (num >= 10 && num <= 99) {
            if (num % 10 == 0) {
                value1 = (num / 10) - 1;
                System.out.println("The number is " + tens[value1]);
            }
            else if (num >= 11 && num <= 19) {
                value = (num % 10) - 1;
                System.out.println("The number is " + teens[value]);
            }
            else {
                value1 = (num / 10) - 1;
                value2 = num % 10;
                System.out.println("The number is " + tens[value1] + " " + ones[value2]);
            }
        }
        else if (num >= 100 && num <= 999) {
            if (num % 100 <= 9) {
                value1 = num / 100;
                value2 = num % 100;
                System.out.println("The number is " + ones [value1] + " " + tens[9] + " and " + ones[value2]);
            }
            else if (num % 100 == 0) {
                value1 = num / 100;
                System.out.println("The number is " + ones[value1] + " " + tens[9]);
            }
            else if (num % 100 == 11 || num % 100 == 12 || num % 100 == 13 || num % 100 == 14 || num % 100 == 15 || num % 100 == 16 || num % 100 == 17 || num % 100 == 18 || num % 100 == 19) {
                    value1 = num / 100;
                    value2 = (num % 100) - 11;
                    System.out.println("The number is " + ones[value1] + " and " + teens[value2]);
            }
            else if ((num % 100) % 10 == 0) {
                    value1 = num / 100;
                    value2 = ((num % 100) / 10) - 1;
                    System.out.println("The number is " + ones[value1] + " " + tens[9] + " and " + tens[value2]);
            }
            else {
                    value1 = num / 100;
                    value2 = ((num % 100) / 10) - 1;
                    value3 = (num % 100) % 10;
                    System.out.println("The number is " + ones[value1] + " " + tens[9] + " and " + tens[value2] + " " + ones[value3]);
            }
        }
    }
}

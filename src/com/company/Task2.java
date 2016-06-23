package com.company;
import java.util.Scanner;
/**
 * Created by gulezahra on 6/18/2016.
 */
public class Task2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            boolean IsContinue = false;
            do {
                System.out.println("Enter an Integer X:");
                int X = s.nextInt();
                System.out.println("X = " + X);
                System.out.println("Enter an Integer Y:");
                int Y = s.nextInt();
                System.out.println("Y = " + Y);
                System.out.println("Enter an Integer Z:");
                int Z = s.nextInt();
                System.out.println("Z = " + Z);

                int a = ((int) Math.pow(X, 2));
                int b = ((int) Math.pow(Y, 2));
                int c = (int) Math.pow(Z, 2);

                if (c == a + b) {
                    System.out.println("Equation satisfied");
                } else {
                    System.out.println("Equation not satisfied");
                    System.out.println("try again");
                    System.out.println("Do you want to continue?");
                    String check = s.next();
                    if (check.equals("y")) {
                        IsContinue = true;
                    }
                }
            }
            while(IsContinue);
        }
}

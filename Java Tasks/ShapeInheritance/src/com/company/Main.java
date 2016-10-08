package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Shape[] shapes = new Shape[10];

        for (int i = 0; i < 3; i++) {
            Random r = new Random();
            int num = r.nextInt(9);
            int num1 = r.nextInt(9);
            int num2 = r.nextInt(9);

            System.out.println("Object number = " + num);
            shapes[num] = new Circle();
            shapes[num].Draw();

            System.out.println("Object number = " + num1);
            shapes[num1] = new Square();
            shapes[num1].Draw();

            System.out.println("Object number = " + num2);
            shapes[num2] = new Rectangle();
            shapes[num2].Draw();
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Valentine v = new Valentine();
        Holiday h = new Holiday();
        Birthday b = new Birthday();

        v.greetings();
        h.greetings();
        b.greetings();

        System.out.println("*************************************");

        Card cardArr [] = new Card [4];
        cardArr[1] = new Valentine();
        cardArr[2] = new Holiday();
        cardArr[3] = new Birthday();

        cardArr[1].greetings();
        cardArr[2].greetings();
        cardArr[3].greetings();
    }
}

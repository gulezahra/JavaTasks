package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount ba = new BankAccount();
        ba.deposit(15.350);
        ba.withDraw(5.500);
        ba.display(15.350,5.500);
    }
}

package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public class BankAccount {
    public double balance;

    public double deposit (double inMoney) {
        return inMoney;
    }

    public double withDraw (double withDrawAmount) {
        return withDrawAmount;
    }

    public void display (double inMoney, double withDrawAmount) {
        System.out.println("Deposited Amount = " + inMoney + "\nWithDrawn Amount = " +withDrawAmount);
        double remainingAmount = inMoney - withDrawAmount;
        System.out.println("Remaining Amount = " + remainingAmount);
    }
}

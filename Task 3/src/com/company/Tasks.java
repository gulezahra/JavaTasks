package com.company;

/**
 * Created by gulezahra on 6/11/2016.
 */
public class Tasks {
    public static void main(String args[]) {
        int fuelPerLitre = 95;
        if (fuelPerLitre >= 100 && fuelPerLitre <= 150)
        {
            System.out.println("Your fuel charges for 5 litres will be in between Rs. 500 and Rs. 750");
        }
        else if (fuelPerLitre >= 90 && fuelPerLitre <= 100)
        {
            System.out.println("Your fuel charges for 5 litres will be in between Rs. 450 and Rs. 500");
        }
        else
        {
            System.out.println("Your fuel charges for 5 litres fuel is not decided yet");
        }
    }
}
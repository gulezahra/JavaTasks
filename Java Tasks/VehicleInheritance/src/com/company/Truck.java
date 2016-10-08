package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public class Truck extends Vehicle {

    public void getPassengerCapacity() {
        System.out.println("Category : " + category);
        System.out.println("Passenger's to travel : " + passengerCarryingCapacity);

        if (passengerCarryingCapacity <= 2)
            System.out.println("Seat Available");
        else
            System.out.println("Seat Not Available");
    }

    public void getLoadingCapacity(int numberOfTones) {
        System.out.println("Loading Tones : " + numberOfTones);

        if (numberOfTones <= 20)
            System.out.println("Loading Capacity Available\n");
        else
            System.out.println("Loading Capacity Exceeded\n");
    }

}

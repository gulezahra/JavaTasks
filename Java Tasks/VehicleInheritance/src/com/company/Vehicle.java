package com.company;

/**
 * Created by gulezahra on 10/8/2016.
 */
public abstract class Vehicle extends VehicleHead {
    public String category;
    public int passengerCarryingCapacity;

    public void getPassengerCapacity() {
        System.out.println("Category : " + category);
        System.out.println("Passenger's to travel : " + passengerCarryingCapacity);

        if (passengerCarryingCapacity <= 10)
            System.out.println("Seat Available");
        else
            System.out.println("Seat Not Available");
    }

}
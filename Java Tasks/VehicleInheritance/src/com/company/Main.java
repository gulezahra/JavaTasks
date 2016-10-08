package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Vehicle vArr [] = new Vehicle[4];

        vArr[0] = new Car();
        vArr[0].category = "L7";
        vArr[0].passengerCarryingCapacity = 5;
        //vArr[1].getPassengerCapacity();

        vArr[1] = new Bus();
        vArr[1].category = "M3";
        vArr[1].passengerCarryingCapacity = 30;
        //vArr[2].getPassengerCapacity();

        vArr[2] = new SchoolBus();
        vArr[2].category = "M3";
        vArr[2].passengerCarryingCapacity = 20;
        //vArr[3].getPassengerCapacity();

        vArr[3] = new Truck();
        vArr[3].category = "N3";
        vArr[3].passengerCarryingCapacity = 1;

        Random r = new Random();
        int num = r.nextInt(4);
        System.out.println("Number = " + num);

        VehicleHead vh = new VehicleHead();
        vh.seeVehicle(vArr[num]);
        System.out.println();

        Truck t = new Truck();
        t.category = "N3";
        t.passengerCarryingCapacity = 1;
        t.getPassengerCapacity();
        t.getLoadingCapacity(40);
    }
}

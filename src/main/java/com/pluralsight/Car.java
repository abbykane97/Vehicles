package com.pluralsight;

public class Car extends Vehicle{

    private int numberofDoors;

    public Car(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers, int cargoCapacity, int numberofDoors) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
        this.numberofDoors = numberofDoors;
    }

    public int getNumberofDoors() {
        return numberofDoors;
    }

    public void setNumberofDoors(int numberofDoors) {
        this.numberofDoors = numberofDoors;
    }
    public void openTrunk(){
        System.out.println("Trunk Opened");

    }
    public void closeTruck(){
        System.out.println("Truck Closed");

    }
}

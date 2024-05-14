package com.pluralsight;

public class Car extends Vehicle{

    private int numberofDoors;

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

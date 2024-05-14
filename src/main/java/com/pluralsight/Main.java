package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Moped abbysMoped = new Moped();
        Car abbysCar = new Car();
        SemiTruck abbysSemiTruck = new SemiTruck();
        HoverCraft abbysHoverCraft = new HoverCraft();


        abbysMoped.setModel("Adventura X EV29");
        abbysMoped.setColor("Pink");
        abbysMoped.setMaxWeight(350);

        abbysCar.setModel("Porsche Cayenne");
        abbysCar.setColor("Pink");
        abbysCar.setNumberofDoors(4);

        abbysSemiTruck.setColor("Pink");
        abbysSemiTruck.setNumberOfTrailers(1);
        abbysSemiTruck.setCargoCapacity(42000);
        abbysSemiTruck.setNumberOfPassengers(2);

        abbysMoped.ride();
        abbysSemiTruck.loadCargo();
        abbysHoverCraft.hover();
        abbysCar.openTrunk();

        System.out.println("Color of the Moped:" + abbysMoped.getColor());
        System.out.println("Fuel capacity of SemiTruck:" + abbysSemiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the Hovercraft" + abbysHoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car:" + abbysCar.getTopSpeed());

    }
}

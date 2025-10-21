package com.pluralsight;

public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private boolean bookedSuites;
    private boolean bookedBasicRooms;

    public Hotel(int numberOfSuites, int numberOfRooms) {
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(boolean bookedSuites, boolean bookedBasicRooms) {
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public boolean isBookedSuites() {
        return bookedSuites;
    }

    public boolean isBookedBasicRooms() {
        return bookedBasicRooms;
    }
}

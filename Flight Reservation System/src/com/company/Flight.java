package com.company;

public class Flight {

            // declaring attributes of this class private and accessing them using getters and setters
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;


        // constructor of flight class
    public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }

        // getters and setters

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

        // methods

    String getFlightDetails() {
        return "Flight No: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
    }

    boolean checkAvailability() {
        if(bookedSeats < capacity) {
            return true;
        }
        else {
            return false;
        }
    }

    void incrementBookingCounter() {
        bookedSeats += 1;
    }

}

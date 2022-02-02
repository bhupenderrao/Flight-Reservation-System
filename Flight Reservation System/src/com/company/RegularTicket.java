package com.company;

public class RegularTicket extends Ticket {

    String specialServices;


        // constructor
    public RegularTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         boolean cancelled, String specialServices) {

        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);

        this.specialServices = specialServices;
        flight.incrementBookingCounter(); // it will increment booked seats when a seat is booked

    }


        // methods
    String getSpecialServices() {
        return specialServices;
    }

    void updateSpecialServices(String updatedSpecialServices) {
        this.specialServices = updatedSpecialServices;
    }

}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket {

    String hotelAddress;

    String[] selectedTouristLocation = new String[5];



        // constructor
    public TouristTicket(String pnr, String from, String to, Flight flight, String departureDateTime,
                         String arrivalDateTime, Passenger passenger, String seatNo, float price,
                         boolean cancelled, String hotelAddress, String[] selectedTouristLocation) {

        super(pnr, from, to, flight, departureDateTime, arrivalDateTime, passenger, seatNo, price, cancelled);

        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;

        flight.incrementBookingCounter(); // it will increment booked seats when a seat is booked
    }



        // setter for selectedTouristLocation
    public void setSelectedTouristLocation(String[] selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }


        // methods
    String getHotelAddress() {
        return hotelAddress;
    }

        // method to print all the locations that are selected by the tourist at the time of ticket booking
    String getTouristLocation() {
        return Arrays.toString(selectedTouristLocation);
    }

        // method to remove tourist location if required once they are declared
    void removeTouristLocation(String location) {
        List<String> myList = new ArrayList<>(Arrays.asList(selectedTouristLocation));
        myList.remove(location);
        selectedTouristLocation = myList.toArray(new String[0]);
    }

        // method to add tourist location if required once they are declared
    void addTouristLocation(String location) {
        List<String> myList = new ArrayList<>(Arrays.asList(selectedTouristLocation));
        myList.add(location);
        selectedTouristLocation = myList.toArray(new String[0]);
    }

}

package com.company;


public class Main {

    public static void main(String[] args) {

        // object of passenger class
        Passenger passenger = new Passenger("Ward No.6", "Farrukhnagar", "Haryana",
                "Bhupender", "9990919210", "bhupender@gmail.com");
        Passenger passenger1 = new Passenger("Ward No.2", "Gurgaon", "Haryana",
                "Nonu", "950640650", "nonu@gmail.com");


        System.out.println(passenger.getId());
        System.out.println(passenger.getPassengerCount());
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getContactDetails());




        // object of flight class
        Flight flight = new Flight("123456", "Vistara Airlines", 100, 75);
        Flight flight1 = new Flight("112", "Indigo Airlines", 200, 110);


        System.out.println(flight.getFlightDetails());
        System.out.println(flight.checkAvailability());




        // object of RegularTicket class
        RegularTicket ticket = new RegularTicket("11223344", "Delhi", "Mumbai", flight, "02-02-2022 04:00",
                "02-02-2022 06:00", passenger, "14f", 5650f, false, "Food and Water");


        System.out.println(ticket.checkStatus());
        System.out.println(ticket.getSpecialServices());
        ticket.updateSpecialServices("Beer and Snacks");
        System.out.println(ticket.getSpecialServices());
        ticket.cancel();
        System.out.println(ticket.checkStatus());



        // object of TouristTicket class
        TouristTicket ticket1 = new TouristTicket("44332211", "Delhi", "Thailand", flight1, "02-02-2022 06:00",
                 "02-02-2022 05:00", passenger1, "13a", 25600f, false,
                "Pattaya, Thailand", new String[] {"Location-1", "Location-2", "Location-3"});


        System.out.println(ticket1.getHotelAddress());
        System.out.println(ticket1.getTouristLocation());
        System.out.println(ticket1.checkStatus());
        ticket1.cancel();
        System.out.println(ticket1.checkStatus());
        System.out.println(ticket1.selectedTouristLocation[0]);
        System.out.println(flight.getBookedSeats());
        System.out.println(flight1.getBookedSeats());


        ticket1.removeTouristLocation("Location-2");
        ticket1.addTouristLocation("Location-4");
        System.out.println(ticket1.getTouristLocation());
        System.out.println(ticket.getFlightDuration());


        // calling the printTicketDetails() function of main class with both the type of tickets
        printTicketDetails(ticket);
        printTicketDetails(ticket1);


    }
        // function to print the pnr no of the ticket
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}

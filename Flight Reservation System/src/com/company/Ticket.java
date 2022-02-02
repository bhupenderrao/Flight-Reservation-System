package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


    // making this class abstract so we cannot instantiate this, as RegularTicket and TouristTicket will be used to instantiate
public abstract class Ticket {

        // declaring all the attributes of this class
    String pnr, from, to;

    Flight flight;

    String departureDateTime, arrivalDateTime;

    Passenger passenger;

    String seatNo;

    float price;

    boolean cancelled;


        // constructor
    public Ticket(String pnr, String from, String to, Flight flight, String departureDateTime,
                  String arrivalDateTime, Passenger passenger, String seatNo, float price, boolean cancelled) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.flight = flight;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
    }


    public String getPnr() {
        return pnr;
    }

        // methods

    String checkStatus() {
        if(cancelled == true) {
            return "Cancelled";
        } else {
            return "Confirmed";
        }
    }

    int getFlightDuration() {
        return findTimeDifference(departureDateTime, arrivalDateTime);
    }

    void cancel() {
        cancelled = true;
    }


        // defining a function to get the time difference between departureDateTime and arrivalDateTime
    static int
    findTimeDifference(String start_date,
                   String end_date)
    {


        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm");

        try {

            // parse method is used to parse
            // the text from a string to
            // produce the date
            Date d1 = sdf.parse(start_date);
            Date d2 = sdf.parse(end_date);


            long difference_In_Time
                    = d2.getTime() - d1.getTime();

            // Calculate time difference in
            // minutes, hours,
            // and days


            long difference_In_Minutes
                    = (difference_In_Time
                    / (1000 * 60))
                    % 60;

            long difference_In_Hours
                    = (difference_In_Time
                    / (1000 * 60 * 60))
                    % 24;

            long difference_In_Days
                    = (difference_In_Time
                    / (1000 * 60 * 60 * 24))
                    % 365;


            System.out.print(
                    "Flight duration is: ");

            System.out.println(
                            + difference_In_Days
                            + " days, "
                            + difference_In_Hours
                            + " hours and "
                            + difference_In_Minutes
                            + " minutes");
        }

        // Catch the Exception
        catch (ParseException e) {
            e.printStackTrace();
        }

        return 0;
    }


}

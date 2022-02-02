package com.company;

public class Passenger {

    private static int idCounter;
    private int id;

        // declaring child class for Address
    private static class Address {
        String street, city, state;

            // creating a constructor for the above attributes
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }

    public Address address;

        // declaring child class for Contact
    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }

    public Contact contact;

        // initializing the static counter
    static {
        idCounter = 0;
    }


        // creating the constructor of the Passenger class which is the parent class of Address and Contact class
    public Passenger(String addressStreet, String addressCity, String addressState,
                     String contactName, String contactPhone, String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }


                 // declaring methods and getters to return some required values
    public int getId() {
        return this.id;
    }

    public int getPassengerCount() {
        return idCounter;
    }

    public String getAddressDetails() {
        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {
        return contact.name + ", " + contact.phone + ", " + contact.email;
    }


    void updateAddressDetails(String newAddressStreet, String newAddressCity, String newAddressState) {
        this.address = new Address(newAddressStreet, newAddressCity, newAddressState);
    }

    void updateContactDetails(String newContactName, String newContactPhone, String newContactEmail) {
        this.contact = new Contact(newContactName, newContactPhone, newContactEmail);
    }


}

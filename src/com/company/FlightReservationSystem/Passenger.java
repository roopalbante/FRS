package com.company.FlightReservationSystem;

public class Passenger {
    //attributes
    private int id;
    private Address address;
    private Contact contact;

    //counter attribute
    private static  int idCounter;

    //nested class Address
    private static class Address {
        //attributes
        private String street;
        private String city;
        private String state;

        //constructor
        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }

        //methods
        String getAddressDetails(){
            return "Address: " + street + ", " + city +  ", " + state + " ";
        }

        void updateAddressDetails(String[] addressDetail){
           }
    }

    //nested class Contact
    private static class Contact {

        //attributes
        private String name;
        private String phone;
        private String email;

        //constructor
        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        //methods
        public String getContactDetails(){
            return "Name: " + name +  ", Phone: " + phone +  ", Email: " + email + " ";
        }

        public void updateContactDetails(String[] contactDetails){
           }
    }

    //constructor
    public Passenger(String street, String city, String state, String name, String phone, String email){
        Address address = new Address(street, city, state);
        this.address = address;
        Contact contact = new Contact(name, phone, email);
        this.contact = contact;

        id = ++idCounter;
    }


    //methods
    int getPassengerCount(){
        return idCounter;
    }
}

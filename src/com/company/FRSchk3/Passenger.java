package com.company.FRSchk3;

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

        //setters and getters start
        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
        //setters and getters end

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

        //setters and getters start
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
        //setters and getters end

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

    //setters and getters start
    public int getId() {
        return id;
    }

    public void setAddress(String[] addressDetails) {
        address.updateAddressDetails(addressDetails);
    }

    public void setContact(String[] contactDetails) {
        contact.updateContactDetails(contactDetails);
    }

    public String getPassenger(){
        return "ID: " + id + " " + getContact() + getAddress();
    }

    public void setPassenger(String[] contactDetails, String[] addressDetails){
        address.updateAddressDetails(addressDetails);
        contact.updateContactDetails(contactDetails);
    }

    public String getContact(){
        return contact.getContactDetails();
    }

    public String getAddress(){
        return address.getAddressDetails();
    }
    //setters and getters end


    //methods
    int getPassengerCount(){
        return idCounter;
    }
}

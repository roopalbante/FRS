package com.company.FRSchk4;

public class RegularTicket extends Ticket{
    //attributes
    private String specialServices;

    //constructor with inherited attributes
    public RegularTicket(String specialServices, String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flightNumber, airline, capacity, bookedSeats, street, city, state, name, phone, email);
        this.specialServices = specialServices;
    }

    //methods
    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}


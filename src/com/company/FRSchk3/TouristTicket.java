package com.company.FRSchk3;

public class TouristTicket{
    //attributes
    private String hotelAddress;
    private String[] selectedTouristLocation = new String[5];

    //constructor with inherited attributes
    public TouristTicket(String hotelAddress, String[] selectedTouristLocation, String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = selectedTouristLocation;
    }

    //methods
    String getHotelAddress(){
        return hotelAddress;
    }

    String getTouristLocations(String n){
        return n;
    }

    void removeTouristLocations(String location){
    }

    void addTouristLocations(String location){
    }
}

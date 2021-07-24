package com.company.FRSchk5;

public abstract class Ticket {

    //attributes
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float price;
    private boolean cancelled;

    //aggregation attributes
    private Flight flight;
    private Passenger passenger;

    //constructor
    public Ticket(String pnr, String from, String to,  String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String flightNumber, String airline, int capacity, int bookedSeats, String street, String city, String state, String name, String phone, String email) {
        this.pnr = pnr;
        this.from = from;
        this.to = to;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;

        Flight flight = new Flight(flightNumber, airline, capacity, bookedSeats);
        this.flight = flight;

        Passenger passenger = new Passenger(street, city, state, name, phone, email);
        this.passenger = passenger;

    }

    //setters and getters start
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public String getFlight() {
        return flight.getFlightDetails();
    }

    public void setFlight(String[] flightDetails, int capacity, int bookedSeats) {
        flight.setFlightDetails(flightDetails, capacity, bookedSeats);
    }

    public String getPassenger() {
        return passenger.getPassenger();
    }

    public void setPassenger(String[] contactDetails, String[] addressDetails) {
        passenger.setPassenger(contactDetails, addressDetails);
    }
    //setters and getters end

    //methods
    public String checkStatus(){
        String status;
        if(cancelled){
            status = "Cancelled";
        }
        else{
            status = "Confirmed";
        }
        return status;
    }

    public int calDuration(){
        int duration = 0;
        return duration;
    }

    public void ticketCancel(){
        cancelled = true;
    }

    public static void printDetails(Ticket ticket){
        System.out.println("PNR: " + ticket.getPnr());
    }
}

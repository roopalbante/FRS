package com.company.FlightReservationSystem;

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
        }

        //methods
        public String checkStatus(String n){
            return n;
        }

        public int calDuration(int n){
            return  n;
            }

        public void ticketCancel(){
        }

        public static void printDetails(Ticket ticket){
            }
}
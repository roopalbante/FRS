package com.company.FlightReservationSystem;

    public class Flight {
        //attributes
        private String flightNumber;
        private String airline;
        private int capacity;
        private int bookedSeats;

        //constructor
        public Flight(String flightNumber, String airline, int capacity, int bookedSeats) {
            this.flightNumber = flightNumber;
            this.airline = airline;
            this.capacity = capacity;
            this.bookedSeats = bookedSeats;
        }

        //methods
        public String getFlightDetails(){
            return "Flight number: " + flightNumber + ", Airline: " + airline + ", Capacity: " + capacity + ", Booked Seats: " + bookedSeats;
        }

        public void setFlightDetails(String[] flightDetails, int capacity, int bookedSeats){

        }

        boolean checkAvailability(){
            boolean availability = false;
            return availability;
        }

        void updateSeats(){
            ++bookedSeats;
        }
}

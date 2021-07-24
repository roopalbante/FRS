package com.company.FRSchk5;

public class Source {
    public static void main(String[] args) {
        Ticket ticket1 = new RegularTicket("Coffee and Breakfast", "1234QWER", "Delhi", "Kochi", "7", "10", "13B", 100.0f, false, "ZXCV1234", "Indian Airlines", 100, 50, "Street", "City", "State", "Abhishek", "9876543210", "email@example.com");


        Ticket ticket2 = new TouristTicket("Hotel Address", new String[]{"Kochi", "Delhi", "Mumbai", null, null}, "0987POIU", "Malaysia", "Mumbai", "2", "11", "16C", 200.0f, false, "MNBV0987", "Malaysian Airlines", 200, 150, "Street2", "Kuala Lumpur City", "Kuala Lumpur", "Mathew", "4561237890", "example@email.com");

        printTicketDetails(ticket1);
        printTicketDetails(ticket2);
    }

    public static void printTicketDetails(Ticket ticket){
        ticket.printDetails(ticket);
    }
}



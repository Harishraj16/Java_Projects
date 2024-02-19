// TheatreTicketInterface.java
package controllers;

public interface TheatreTicketInterface {
    boolean bookSeat(int seatNumber);
    boolean unbookSeat(int seatNumber);
    void displayAvailableSeats();
}

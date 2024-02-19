package controllers;

import models.Seat;
import models.Theatre;

import java.util.List;

public class TheatreTicketController implements TheatreTicketInterface {
    private Theatre theatre;

    public TheatreTicketController(Theatre theatre) {
        this.theatre = theatre;
    }

    public boolean bookSeat(int seatNumber) {
        List<Seat> seats = theatre.getSeats();
        if (seatNumber >= 1 && seatNumber <= seats.size()) {
            Seat seat = seats.get(seatNumber - 1);
            if (!seat.isBooked()) {
                seat.book();
                return true;
            }
        }
        return false;
    }

    public boolean unbookSeat(int seatNumber) {
        List<Seat> seats = theatre.getSeats();
        if (seatNumber >= 1 && seatNumber <= seats.size()) {
            Seat seat = seats.get(seatNumber - 1);
            if (seat.isBooked()) {
                seat.unbook();
                return true;
            }
        }
        return false;
    }

    public void displayAvailableSeats() {
        List<Seat> seats = theatre.getSeats();
        System.out.println("Available seats for " + theatre.getName() + ":");
        for (Seat seat : seats) {
            if (!seat.isBooked()) {
                System.out.print(seat.getSeatNumber() + " ");
            }
        }
        System.out.println();
    }
}

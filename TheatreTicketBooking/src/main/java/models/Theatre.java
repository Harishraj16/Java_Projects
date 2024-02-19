package models;

import java.util.ArrayList;
import java.util.List;

public class Theatre implements TheatreInterface{
    private String name;
    private List<Seat> seats;

    public Theatre(String name, int numSeats) {
        this.name = name;
        seats = new ArrayList<>();
        for (int i = 1; i <= numSeats; i++) {
            seats.add(new Seat(i));
        }
    }

    public String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

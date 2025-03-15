package designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public class Aircraft {
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;


    public Aircraft(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("A2");
    }

    public boolean bookSeat(String seat) {
        return this.availableSeats.remove(seat);
    }
}
package designpatterns.singleton.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {

    //EAGER Initializtion
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("747-900");

    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingletonEager(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("A2");
    }

    public boolean bookSeat(String seat) {
        return this.availableSeats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }
}
package designpatterns.singleton.singletonlazy.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonLazy {

    //EAGER Initializtion
    private static AircraftSingletonLazy INSTANCE;

    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    public AircraftSingletonLazy(String name) {
        this.name = name;
    }

    {
        availableSeats.add("A1");
        availableSeats.add("A2");
    }

    public boolean bookSeat(String seat) {
        return this.availableSeats.remove(seat);
    }

    public static AircraftSingletonLazy getINSTANCE() {
        //trying to make it thread safe
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new AircraftSingletonLazy("747-900");
                }
            }
        }
        return INSTANCE;
    }
}
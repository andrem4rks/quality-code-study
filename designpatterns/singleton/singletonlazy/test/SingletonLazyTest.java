package designpatterns.singleton.singletonlazy.test;

import designpatterns.singleton.singletonlazy.domain.AircraftSingletonLazy;

public class SingletonLazyTest {
    public static void main(String[] args) {

        bookSeat("A1");
        bookSeat("A1");

    }

    private static void bookSeat(String seat) {
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}

package designpatterns.singleton.test;

import designpatterns.singleton.domain.Aircraft;
import designpatterns.singleton.domain.AircraftSingletonEager;

public class SingletonEagerTest {
    public static void main(String[] args) {

        bookSeat("A1");
        bookSeat("A1");

    }

    private static void bookSeat(String seat) {
        AircraftSingletonEager aircraft = AircraftSingletonEager.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}
package designpatterns.singleton.singletoneenum.test;

import designpatterns.singleton.singletoneenum.domain.AircraftSingletonEnum;

public class SingletonEnumTest {
    public static void main(String[] args) {

        bookSeat("A1");
        bookSeat("A1");

    }

    private static void bookSeat(String seat) {
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft.hashCode());
    }
}

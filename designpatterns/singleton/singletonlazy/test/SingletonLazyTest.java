package designpatterns.singletonlazy.test;

import designpatterns.singletonlazy.domain.Aircraft;

public class SingletonLazyTest {
    public static void main(String[] args) {

        bookSeat("A1");
        bookSeat("A1");

    }

    private static void bookSeat(String seat) {
        Aircraft aircraft = new Aircraft("747-900");
        System.out.println(aircraft.bookSeat(seat));
        System.out.println(aircraft);
    }
}

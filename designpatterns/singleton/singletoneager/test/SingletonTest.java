package designpatterns.singleton.singletoneager.test;

import designpatterns.singleton.singletoneager.domain.Aircraft;

public class SingletonTest {
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

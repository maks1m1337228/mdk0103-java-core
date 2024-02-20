package Alpinists;

import Alpinists.Alpinist;
import Alpinists.Mountain;

public class App {
    public static void main(String[] args) {
        Alpinists.Alpinist[] alpinists = new Alpinists.Alpinist[3];
        alpinists[0] = new Alpinists.Alpinist("Petya", 12, "Toilet");
        alpinists[1] = new Alpinists.Alpinist("Tony", 54, "Ohio");
        alpinists[2] = new Alpinists.Alpinist("Sasha", 19, "Moskow");

        new Alpinists.Alpinist("kek", 19, "Moskow");

        Alpinists.Alpinist[] alpinists2= new Alpinists.Alpinist[3];

        Alpinist vasya = new Alpinist("Vasya", 22, "spb");
        vasya.getAddress();
        vasya.setAddress("Msc");
        vasya.getAddress();




//        Alpinists.Mountain everest = new Alpinists.Mountain("Everest", "Nepal", 8848, false, alpinists);
//        Alpinists.Mountain alps = new Alpinists.Mountain("Alps", "France", 4810, true, alpinists2 );
    }
}


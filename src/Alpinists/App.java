package Alpinists;

import Alpinists.Alpinist;
import Alpinists.Mountain;

public class App {
    public static void main(String[] args) {
        Alpinists.Alpinist[] alpinists = new Alpinists.Alpinist[3];
        alpinists[0] = new Alpinists.Alpinist("Petya", 12, "Toilet");
        alpinists[1] = new Alpinists.Alpinist("Tony", 54, "Ohio");
        alpinists[2] = new Alpinists.Alpinist("Sasha", 19, "Moskow");

        Alpinists.Mountain everest = new Alpinists.Mountain("Everest", "Nepal", 8848, false, alpinists);
    }
}


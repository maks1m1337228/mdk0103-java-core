package Alpinists;

import Alpinists.Alpinist;
import Alpinists.Mountain;

public class App {
    public static void main(String[] args) {
        Alpinist[] alpinists = new Alpinist[3];
        alpinists[0] = new Alpinist("Petya", 12, "Toilet");
        alpinists[1] = new Alpinist("Tony", 54, "Ohio");
        alpinists[2] = new Alpinist("Sasha", 19, "Moscow");

        Groups group = new Groups(true, new Alpinist[5], "Everest");

        // Добавляем альпинистов в группу
        group.addToGroup(alpinists[0]);
        group.addToGroup(alpinists[1]);
        group.addToGroup(alpinists[2]);
    }

    }



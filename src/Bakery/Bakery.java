package Bakery;

import java.util.ArrayList;

public class Bakery {
    String name;
    ArrayList<Courier> Couriers;
    ArrayList<Baker> Bakers;
    Storehouse storage;

    public Bakery(String name, ArrayList<Courier> couriers, ArrayList<Baker> bakers, Storehouse storage) {
        this.name = name;
        Couriers =  new ArrayList<>();
        Bakers = new ArrayList<>();
        this.storage = storage;
    }
}

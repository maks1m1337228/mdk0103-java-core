package Bakery;

import java.util.ArrayList;
import Bakery.*;

public class Storehouse {
    static ArrayList<Order> storage;

    public Storehouse(ArrayList<Order> storage) {
        this.storage = new ArrayList<>(50);
    }

public static void addOrderToStorage(Order order) {
    ArrayList<Order> storage = new ArrayList<>(50);
    if (storage.size() < 50) {
        storage.add(order);
    } else {
        System.out.println("Пекарь ожидает свободного вместа");
    }



}


}

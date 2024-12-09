package Bakery;

import java.util.ArrayList;
import Bakery.*;

public class Baker {
    String bakerName;
    String bakerSurname;
    int experienceAge;
    ArrayList<Order> orders;

    public Baker(String bakerName, String bakerSurname, int experienceAge, ArrayList<Order> orders) {
        this.bakerName = bakerName;
        this.bakerSurname = bakerSurname;
        this.experienceAge = experienceAge;
        this.orders = new ArrayList<>();
    }

    public void addOrderToBaker(Order order) {
        boolean IfDone;
        orders.add(order);
        System.out.println("\nЗаказ " + order + " готов.");
        IfDone = true;
        if (IfDone) {
            Storehouse.addOrderToStorage(order);
        }

        orders.remove(order);

    }


}

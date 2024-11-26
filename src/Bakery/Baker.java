package Bakery;

import java.util.ArrayList;
import Bakery.*;

public class Baker extends Human {
    int experienceAge;
    ArrayList<Order> orders;

    public Baker(String name, String surname, int age, int experienceAge, ArrayList<Order> orders) {
        super(name, surname, age);
        this.experienceAge = experienceAge;
        this.orders = new ArrayList<>();
    }

    public void addOrderToBaker(Order order) {
        boolean IfDone = false;
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(order);
        System.out.println("\nЗаказ " + order + " готов.");
        IfDone = true;
        if (IfDone == true) {
            Storehouse.addOrderToStorage(order);
        }



        orders.remove(order);






    }


}

package Bakery;

import java.util.ArrayList;

public class Courier extends Human {
    ArrayList<Order> trunk;

    public Courier(String name, String surname, int age, ArrayList<Order> pizzaList) {
        super(name, surname, age);
        this.trunk = new ArrayList<>(2);
    }

    public static void getOrderFromStorage(Order order) {
        ArrayList<Order> trunk = new ArrayList<>(2);
        if (!Storehouse.storage.isEmpty()) {
            System.out.println("Курьер ожидает поступления готовых пицц.");
        }

        if (trunk.size() < 2) {
            trunk.add(order);
            System.out.println("\nКурьер" +  "  получил заказ " + order.toString());
            System.out.println("\nЗаказ " + order + " доставлен");
        } else {
            System.out.println("Багажник полон");
        }


    }
}

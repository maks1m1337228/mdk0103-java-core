package Bakery;

import java.util.ArrayList;

public class Courier  {
     String courierName;
     String courierSurname;
     int age;
    ArrayList<Order> trunk;

    public Courier(String courierName, String courierSurname, int age, ArrayList<Order> trunk) {
        this.courierName = courierName;
        this.courierSurname = courierSurname;
        this.age = age;
        this.trunk = new ArrayList<>();
    }

    public void getOrderFromStorage(Order order) {
        ArrayList<Order> trunk = new ArrayList<>(2);
        if (!Storehouse.storage.isEmpty()) {
            System.out.println("Курьер ожидает поступления готовых пицц.");
        }

        if (trunk.size() < 2) {
            trunk.add(order);
            System.out.println("\nКурьер " + courierName +" "+ courierSurname +   "  получил заказ " + order);
            System.out.println("\nЗаказ " + order + " доставлен");
        } else {
            System.out.println("Багажник полон");
        }


    }
}

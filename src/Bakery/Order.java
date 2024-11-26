package Bakery;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizzasOrder;



    public Order(ArrayList<Pizza> pizzasOrder) {
        this.pizzasOrder = new ArrayList<>();
    }
    public void pizzaAddToOrder(Pizza pizza) {
        ArrayList<Pizza> pizzasOrder = new ArrayList<>();
        pizzasOrder.add(pizza);
        System.out.println("Пицца " +  pizza + " добавлена в заказ");

    }

    public void printOrder() {
        for (int i = 0; i < pizzasOrder.size(); i++) {
            pizzasOrder.get(i);

        }
    }


    @Override
    public String toString() {
        return "pizzasOrder=" + pizzasOrder;
    }
}

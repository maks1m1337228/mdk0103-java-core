package Bakery;

import java.util.ArrayList;

public class Order {
    ArrayList<Pizza> pizzasOrder;



    public Order(ArrayList<Pizza> pizzasOrder) {
        this.pizzasOrder = new ArrayList<>();
    }

    public void pizzaAddToOrder(Pizza pizza) {
        pizzasOrder.add(pizza);
        System.out.println("Пицца " +  pizza + " добавлена в заказ");

    }




    @Override
    public String toString() {
        return  "" + pizzasOrder;
    }
}

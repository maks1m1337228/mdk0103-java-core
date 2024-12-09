package Bakery;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Storehouse storage = new Storehouse(new ArrayList<Order>());
        Bakery bakery = new Bakery("HotPizza", new ArrayList<Courier>(), new ArrayList<Baker>(), storage);

        Courier courier1 = new Courier("Бабиджон", "Дагестанов", 30, new ArrayList<Order>());
        Courier courier2 = new Courier("Бабмурод", "Угли", 45, new ArrayList<Order>());
        Courier courier3 = new Courier("Аллах", "Охлажонов", 28, new ArrayList<Order>());
        Courier courier4 = new Courier("Серг", "Бебриков", 23, new ArrayList<Order>());
        Courier courier5 = new Courier("Оаы", "Аяо", 34, new ArrayList<Order>());
        Courier courier6 = new Courier("Тандыр", "Мухаматов", 19, new ArrayList<Order>());

        Baker baker1 = new Baker("Арсен", "Маркарян", 32,  new ArrayList<Order>());
        Baker baker2 = new Baker("Сергей", "Юсупов", 39,  new ArrayList<Order>());
        Baker baker3 = new Baker("Евлампий", "Мухохват", 32,  new ArrayList<Order>());

        Pizza pizza1 = new Pizza("Маргарита");
        Pizza pizza2 = new Pizza("Пеперони");
        Pizza pizza3 = new Pizza("Четыре сыра");
        Pizza pizza4 = new Pizza("Пармезан");
        Pizza pizza5 = new Pizza("Мясная");
        Pizza pizza6 = new Pizza("Четыре сезона");
        Pizza pizza7 = new Pizza("Грибная");
        Pizza pizza8 = new Pizza("Беконайзер");
        Pizza pizza9 = new Pizza("Пицца с ананасами");
        Pizza pizza10 = new Pizza("Веган-пицца");




        Order order1 = new Order(new ArrayList<Pizza>());
        Order order2 = new Order(new ArrayList<Pizza>());



        order1.pizzaAddToOrder(pizza1);
        order1.pizzaAddToOrder(pizza2);

        order2.pizzaAddToOrder(pizza9);
        order2.pizzaAddToOrder(pizza10);




        baker1.addOrderToBaker(order1);
        baker2.addOrderToBaker(order2);

        courier1.getOrderFromStorage(order1);
        courier4.getOrderFromStorage(order2);








    }
}

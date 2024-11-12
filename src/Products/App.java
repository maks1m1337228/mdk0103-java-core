package Products;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        MyProducts myProducts = new MyProducts(100, 70, 200, 2000);

        Product product1 = new Product("Колбаса", 20, 8, 80, 600);
        Product product2 = new Product("Банан", 15, 3, 45, 200);
        Product product3 = new Product("Ватрушка", 3, 70, 100, 400);
        Product product4 = new Product("Сыр", 30, 18, 112, 500);
        Product product5 = new Product("Чипсы", 4, 50, 80, 700);
        Product product6 = new Product("Морковь", 5, 2, 30, 60);

        myProducts.addProduct(product1);
        myProducts.addProduct(product2);
        myProducts.addProduct(product3);
        myProducts.addProduct(product4);
        myProducts.addProduct(product5);
        myProducts.addProduct(product6);

        myProducts.printProducts();






    }
}

package Products;

import java.util.ArrayList;

public class MyProducts {
    private int maxProteins;
    private int maxFats;
    private int maxCarbohydrates;
    private int maxCalories;
    private ArrayList<Product> productsList;

    public MyProducts(int maxProteins, int maxFats, int maxCarbohydrates, int maxCalories) {
        this.maxProteins = maxProteins;
        this.maxFats = maxFats;
        this.maxCarbohydrates = maxCarbohydrates;
        this.maxCalories = maxCalories;
        this.productsList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        if (product.getProteins() <= maxProteins &&
                product.getFats() <= maxFats &&
                product.getCarbohydrates() <= maxCarbohydrates &&
                product.getCalories() <= maxCalories) {
            productsList.add(product);
        } else {
            if (product.getProteins() > maxProteins) {
                System.out.println("слишком много белков");
            }
            if (product.getFats() > maxFats) {
                System.out.println("слишком много жиров");
            }
            if (product.getCarbohydrates() > maxCarbohydrates) {
                System.out.println("слишком много углеводов");

            }
            if (product.getCalories() > maxCalories) {
                System.out.println("слишком много калорий");
            }
        }
    }

    public void printProducts() {
        if (productsList.isEmpty()) {
            System.out.println("Список продуктов пуст.");
        } else {
            for (Product product : productsList) {
                System.out.println(product.getName());
            }
        }
    }
}

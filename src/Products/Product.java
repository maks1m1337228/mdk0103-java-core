package Products;

public class Product {
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;

    public Product(String name, int proteins, int fats, int carbohydrates, int calories) {
        check();
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
    }

    public Product(String name, int proteins, int fats, int carbohydrates) {
        check();
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = 0;
    }

    public Product(String name) {
        check();
        this.name = name;
        this.proteins = 0;
        this.fats = 0;
        this.carbohydrates = 0;
        this.calories = 0;
    }

    public Product() {
        check();
        this.name = "неизвестно";
        this.proteins = 0;
        this.fats = 0;
        this.carbohydrates = 0;
        this.calories = 0;

    }


    private void check() {
        if (proteins < 0 || fats < 0 || carbohydrates < 0 || calories < 0) {
            System.out.println("значения должны быть неотрицательными");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFats() {
        return fats;
    }

    public void setFats(int fats) {
        this.fats = fats;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(int carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", carbohydrates=" + carbohydrates +
                ", calories=" + calories +
                '}';
    }
}

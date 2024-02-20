package CatsMouses;

public class Cat {
    String name;
    int speed;
    int weight;
    Mouse[] caughtMouses;


    public Cat(String name, int speed, int weight) {
        this.name = name;
        this.speed = speed;
        this.weight = weight;
        this.caughtMouses = new Mouse[10];
    }

    public void mousesCatching (Mouse mouse) {
        for (int i = 0; i < caughtMouses.length; i++) {
            if (caughtMouses[i] == null) {
                caughtMouses[i] = mouse;
                System.out.println("мышь поймана");
                return;
            }
        }
        System.out.println("достигнуто максимальное количество мышей");
    }
    public int mousesQuantity() {
        int quantity = 0;
        for (int i = 0; i < caughtMouses.length; i++) {
            if (caughtMouses[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }
}

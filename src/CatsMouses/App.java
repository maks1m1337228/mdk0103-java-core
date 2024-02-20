package CatsMouses;

public class App {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murzik", 20, 7);
        Mouse mouse1 = new Mouse(15);
        Mouse mouse2 = new Mouse(16);

        App app = new App();
        app.catchCheck(cat1, mouse1);
        app.catchCheck(cat1, mouse2);
    }

    public void catchCheck(Cat cat, Mouse mouse) {
        if (cat.speed > Mouse.speed) {
            cat.mousesCatching(mouse);
            System.out.println("количество пойманных мышей: " + cat.mousesQuantity());
        } else {
            System.out.println("мышь не поймана");
        }
    }
}
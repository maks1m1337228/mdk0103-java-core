package Fitness;

public class FitnessZone {
    private Abonement[] abonements = new Abonement[20];
    private int count = 0;
    private String name;

    public FitnessZone(String name) {
        this.name = name;
    }

    public void registerAbonement(Abonement abonement) {
        if (count < 20) {
            abonements[count++] = abonement;
            System.out.println("Абонемент успешно зарегистрирован в " + name);
        } else {
            System.out.println("Достигнуто максимальное количество абонементов в " + name);
        }
    }
}

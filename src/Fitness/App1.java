package Fitness;

import java.util.Date;

public class App1 {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        Visitor visitor1 = new Visitor("Иван", "Иванов", 1990);
        Visitor visitor2 = new Visitor("Петр", "Петров", 1985);

        Abonement dailyAbonement = new Abonement(visitor1, new Date(), new Date(new Date().getTime() + 24 * 60 * 60 * 1000));
        Abonement fullAbonement = new Abonement(visitor2, new Date(), new Date(new Date().getTime() + 30 * 24 * 60 * 60 * 1000));

        fitnessClub.visit(visitor1, dailyAbonement, "pool");  
        fitnessClub.visit(visitor2, fullAbonement, "gym");
    }

}

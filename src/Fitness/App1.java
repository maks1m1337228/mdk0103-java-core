package Fitness;

import java.time.LocalDate;

public class App1 {
    public static void main(String[] args) {
        FitnessClub fitnessClub = new FitnessClub();

        Visitor visitor1 = new Visitor("Иван", "Иванов", 1990);
        Visitor visitor2 = new Visitor("Петр", "Петров", 1985);

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate thirtyDaysLater = today.plusDays(30);

        Abonement dailyAbonement = new Abonement(visitor1, today, tomorrow);
        Abonement fullAbonement = new Abonement(visitor2, today, thirtyDaysLater);

        fitnessClub.visit(visitor1, dailyAbonement, "pool");
        fitnessClub.visit(visitor2, fullAbonement, "gym");
    }
}
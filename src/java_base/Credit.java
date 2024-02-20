package java_base;
import java.util.Scanner;
public class Credit {
    public static void main(String[] args) {

        double budget, target = 1000000, percent = 0.10;
        int years = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("стартовый бюджет:");
        budget = scanner.nextInt();

        while (budget < target) {
            budget += budget * percent;
            years++;
        }
        System.out.println("Ваш бюджет достигнет цели через " + years + " лет");
    }
}

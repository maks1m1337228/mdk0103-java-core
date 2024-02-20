package exam1;

import java.util.Scanner;

public class FinancialCalculator {
    private static int point;
    private static double[] expenses = new double[30];

    public static void main(String[] args) {
        while (true) {
            calculatorMenu();
            switch (point) {
                case 0:
                    System.out.println("\nДо свидания, выхожу из приложения.\n");
                    System.exit(0);
                case 1:
                    System.out.println("\nВыбран пункт номер 1\n");
                    expansesPerDay();
                    break;
                case 2:
                    System.out.println("\nВыбран пункт номер 2\n");
                    monthlyExpanses();
                    break;
                case 3:
                    System.out.println("\nВыбран пункт номер 3\n");
                    monthlyMaxSum();
                    break;
                case 4:
                    System.out.println("\nВыбран пункт номер 3\n");
                    currencyChanger();
                    break;
                default:
                    System.out.println("Выберите пункт 1, 2, 3, 4 или 0");
                    break;
            }
        }
    }

    public static void calculatorMenu() {
        Scanner scPoint = new Scanner(System.in);

        System.out.println("\n1. Ввести расходы за день");
        System.out.println("2. Траты за месяц");
        System.out.println("3. Самая большая сумма расхода за месяц");
        System.out.println("4. Конвертер валют");
        System.out.println("0. Выход\n");
        System.out.println("Выберите пункт меню : ");
        point = scPoint.nextInt();
    }

    public static void expansesPerDay() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Введите день, в который хотите записать траты : ");
            int dayOfMonth = sc.nextInt();
            if (dayOfMonth < 1 || dayOfMonth > 30) {
                System.out.println("\nНомер дня должен быть от 1 до 30.\n");
                continue;
            }

            if (expenses[dayOfMonth - 1] != 0) {
                System.out.println("На день " + dayOfMonth + " уже внесены расходы: " + expenses[dayOfMonth - 1] + " рублей");
                System.out.print("Желаете перезаписать сумму? (да/нет): ");
                Scanner scA1 = new Scanner(System.in);
                String answer1 = scA1.next();
                if (!answer1.equalsIgnoreCase("да")) {
                    return;
                }
            }

            System.out.print("Введите сумму трат за " + dayOfMonth + " день: ");
            Scanner scExp = new Scanner(System.in);
            double expansesOfDay = scExp.nextDouble();
            expenses[dayOfMonth - 1] = expansesOfDay;

            System.out.println("Желаете выбрать другой день? (да/нет): ");
            Scanner scA2 = new Scanner(System.in);
            String answer2 = scA2.next();
            if (!answer2.equalsIgnoreCase("да")) {
                break;
            }
        }
    }

    public static void monthlyExpanses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("Расходы за " + (i + 1) + " день: " + expenses[i] + " рублей");
        }

        while (true) {
            System.out.println("\nВведите 0 чтобы выйти в меню\n");
            Scanner scExit = new Scanner(System.in);
            int exitAnswer = scExit.nextInt();
            if (exitAnswer == 0)
                break;
            else {
                System.out.println("Чтобы выйти, нужно ввести 0\n");
                continue;
            }
        }
    }

    public static void monthlyMaxSum() {
        int maxDay = 0;
        double max = expenses[0];
        boolean expensesEntered = false;

        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > max) {
                max = expenses[i];
                maxDay = i + 1;
                expensesEntered = true;

            }
        }


        if (!expensesEntered) {
            System.out.println("Вы еще не ввели расходы.");
        }
        else {
            System.out.println("Максимальная сумма трат была за " + maxDay + " день: " + max);
        }
    }

    public static void currencyChanger() {
        double[] originalExpenses = expenses.clone();

        System.out.println("\nВыберите валюту, в которую нужно перевести: \n");
        System.out.println("1. Евро");
        System.out.println("2. Доллары");
        System.out.println("3. Юани");

        Scanner scCurrency = new Scanner(System.in);
        int currency = scCurrency.nextInt();

        switch (currency) {
            case 1:
                System.out.println("Выбраны Евро");
                for (int i =0; i < expenses.length; i++)
                    System.out.println("Расходы за " + (i + 1) + " день: " + (expenses[i] /= 98) + " евро");
                break;
            case 2:
                System.out.println("Выбраны доллары");
                for (int i =0; i < expenses.length; i++)
                    System.out.println("Расходы за " + (i + 1) + " день: " + (expenses[i] /= 90) + " долларов");
                break;
            case 3:
                System.out.println("Выбраны доллары");
                for (int i =0; i < expenses.length; i++)
                    System.out.println("Расходы за " + (i + 1) + " день: " + (expenses[i] /= 13) + " юаней");
                break;
        }
        expenses = originalExpenses;
    }
}
package TaskManager;

import java.util.Scanner;

import static TaskManager.TaskManager.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            System.out.print("введите номер действия");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    addTask(scanner);
                    break;
                case 2:
                    viewTasks(scanner);
                    break;
                case 3:
                    viewRecentTasks();
                    break;
                case 4:
                    scanner.close();
                    return;
                default:
                    System.out.println("неверный выбор!");
            }
        }
    }
}

package TaskManager;

import java.text.SimpleDateFormat;
import java.util.*;

public class TaskManager {
    static ArrayList<Task> tasks = new ArrayList<>();
    private static final List<Task> recentTasks = new LinkedList<>();




    static void menu() {
        System.out.println("1. добавить задачу");
        System.out.println("2. посмтореть задачи");
        System.out.println("3. посмотреть недавние задачи");
        System.out.println("\n4. выход");

    }

    static void startMenu() {
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

    static void addTask(Scanner scanner) {
        System.out.print("введите заголовок задачи: ");
        String title = scanner.nextLine();

        System.out.print("введите текст задачи: ");
        String text = scanner.nextLine();

        Task task = new Task(title, text, new Date());
        tasks.add(task);
        System.out.println("задача добавлена");
    }


    static void viewTasks(Scanner scanner) {
        System.out.print("введите период просмотра (день или неделя): ");
        String period = scanner.nextLine();

        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);

        List<Task> filteredTasks = new ArrayList<>();

        if (period.equalsIgnoreCase("день")) {
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date startOfDay = calendar.getTime();
            calendar.add(Calendar.DATE, 1);
            Date endOfDay = calendar.getTime();

            filteredTasks = tasks.stream()
                    .filter(task -> task.getDate().after(startOfDay) && task.getDate().before(endOfDay))
                    .toList();
        } else if (period.equalsIgnoreCase("неделя")) {
            calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);

            Date startOfWeek = calendar.getTime();
            calendar.add(Calendar.DATE, 7);
            Date endOfWeek = calendar.getTime();

            filteredTasks = tasks.stream()
                    .filter(task -> task.getDate().after(startOfWeek) && task.getDate().before(endOfWeek))
                    .toList();
        } else {
            System.out.println("неверный период");
            return;
        }

        if (filteredTasks.isEmpty()) {
            System.out.println("в этом периоде нет задач.");
        } else {
            System.out.println("\nзадачи на " + period + ":");
            for (Task task : filteredTasks) {
                System.out.println(task);
                recentTasks.add(task);
                if (recentTasks.size() > 5) {
                    recentTasks.remove(0);
                }
            }
        }
    }

    static void viewRecentTasks() {
        if (recentTasks.isEmpty()) {
            System.out.println("история просмотра пуста");
        } else {
            System.out.println("\nпоследние просмотренные задачи: ");
            for (Task task : recentTasks) {
                System.out.println(task);
            }
        }




    }
}

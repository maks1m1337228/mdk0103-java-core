package java_base;
import java.util.Calendar;
public class Robot {

        public static void main(String[] args) {
            Calendar cal = Calendar.getInstance();
            int hour = cal.get(Calendar.HOUR_OF_DAY);

            if (hour >= 4 && hour < 12) {
                System.out.println("Доброе утро");
            }
            if (hour >= 12 && hour < 18) {
                System.out.println("Добрый день");
            }
            if (hour >= 18 && hour < 23) {
                System.out.println("Добрый вечер");
            }
            if (hour <= 23 && hour < 3) {
                System.out.println("Доброй ночи");
            }
        }
    }


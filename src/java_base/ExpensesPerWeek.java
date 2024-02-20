package java_base;
import java.util.Scanner;
public class ExpensesPerWeek {


        public static void main(String[] args) {

            int sum;
            int[] dow = new int[7];

            for (int i = 0; i < dow.length; i++) {
                dow[i] = (int) ((Math.random() * (1000-0))+0);
                System.out.println("Трата за " + (i+1) + " день: " + dow[i]);
            }

            sum = dow[0] + dow[1] + dow[2] + dow[3] + dow[4] + dow[5] + dow[6];
            System.out.println("Сумма трат за неделю: " + sum);
        }
    }


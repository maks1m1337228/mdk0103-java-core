package java_base;

import java.util.Random;
import java.util.Scanner;

public class Hints {

    public static void main(String[] args) {

        final int min = 1;
        final int max = 9;
        Random rnd = new Random();
        int random = rnd.nextInt(max - min + 1);
        int i = 3;

        while (true) {
            i--;
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите число от 1 до 9:");
            int number = sc.nextInt();
            if (number < random) {
                System.out.println("число больше ");
            }

            if (number > random) {
                System.out.println("число меньше");
            }

            if (number == random) {
                System.out.println("точно в цель");
                break;
            }
        }
    }
}


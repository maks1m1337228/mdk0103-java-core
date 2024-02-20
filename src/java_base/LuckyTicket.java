package java_base;
import java.util.Scanner;
public class LuckyTicket {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("введите номер билета:");
        int ticket = input.nextInt();


        String numberString = Integer.toString(ticket);
        char[] array = numberString.toCharArray();

        int[] intArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            intArray[i] = Character.getNumericValue(array[i]);
        }

        int sumFirst = intArray[0] + intArray[1] + intArray[2];
        int sumSecond = intArray[3] + intArray[4] + intArray[5];


        if (sumFirst == sumSecond) {
            if (sumFirst % 2 == 0) {
                System.out.println("Поздравляем! У вас выигрышный билет");
            }
        }
        else {
            System.out.println("Ваш билет не выиграл");
        }

    }
}

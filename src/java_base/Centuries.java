package java_base;
import java.util.Scanner;
public class Centuries {
    public static void main(String[] args) {

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.println("число:");
        num = scanner.nextInt();

        int century = num / 100;

        switch (century) {
            case 15:
                System.out.println("шестнадцатый век");
                break;
            case 16:
                System.out.println("семнадцатый век");
                break;
            case 17:
                System.out.println("восемнадцатый век");
                break;
            case 18:
                System.out.println("девятнадцатый век");
                break;
            case 19:
                System.out.println("двадцатый век");
                break;
            case 20:
                System.out.println("двадцать первый век");
                break;
            case 21:
                System.out.println("двадцать второй век");
                break;
            default: System.out.println("Неправильный век");

        }
    }
}

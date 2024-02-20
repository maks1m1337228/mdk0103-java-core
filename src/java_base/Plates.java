package java_base;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Plates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол тарелок: ");
        int plates = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Введите кол моющего средства: ");
        double detergent = sc.nextDouble();

        while (detergent >= 0 && plates > 0) {
            detergent -= 0.5;
            plates -= 1;

            if(detergent >= 0){
                DecimalFormat format = new DecimalFormat("0.00");
                System.out.println("Тарелок осталось : "+plates+" Моющего средства осталось: "+format.format(detergent));
            }

            if(plates == 0) {
                System.out.println("тарелки закончились");
                break;
            }

        }
    }
}


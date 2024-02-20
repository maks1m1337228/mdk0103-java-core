package java_base;
import java.util.Arrays;
import java.util.Scanner;
public class NineFloorBuilding {
    public static void main(String[] args) {

        int floatNumber;
        int [][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}, {17,18,19,20}, {21,22,23,24}, {25,26,27,28}, {29,30,31,32}, {33,34,35,36}};
        for (int i = 0; i < matrix.length; i++ ) {
            System.out.println(Arrays.toString(matrix[i]));
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ваша квартира: ");
        floatNumber = sc.nextInt();

        switch (floatNumber) {
            case 1:
                System.out.println("Левая дальняя квартира");
            case 5:
            case 9:
            case 13:
            case 17:
            case 21:
            case 25:
            case 29:
            case 33:
                System.out.println("Левая квартира");
            case 2:
            case 6:
            case 10:
            case 14:
            case 18:
            case 22:
            case 26:
            case 30:
            case 34:
                System.out.println("Правая квартира");
            case 3:
            case 7:
            case 11:
            case 15:
            case 19:
            case 23:
            case 27:
            case 31:
            case 35:
                System.out.println("Правая дальняя квартира");
            case 4:
            case 8:
            case 12:
            case 16:
            case 20:
            case 24:
            case 28:
            case 32:
            case 36:
        }
    }
}


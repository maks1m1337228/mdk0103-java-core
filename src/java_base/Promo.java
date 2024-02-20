package java_base;
import java.util.Scanner;
public class Promo {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите цену товара: ");
            double price = scanner.nextDouble();

            System.out.print("Введите промокод: ");
            int promoCode = scanner.nextInt();

            double discount = 0.0;

            switch (promoCode) {
                case 4525:
                    discount = 0.3;
                    break;
                case 6424:
                case 7012:
                    discount = 0.2;
                    break;
                case 7647:
                case 9011:
                case 6612:
                    discount = 0.1;
                    break;
                default:
                    System.out.println("Промокод не распознан, скидка не применена.");
            }

            double totalPrice = price - (price * discount);
            System.out.println("Итоговая цена со скидкой: " + totalPrice);
        }
    }


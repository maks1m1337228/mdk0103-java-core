package BankAccount;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;


public class Menu {

    private DB db;

    public Menu(DB db){
        this.db = db;
    }


    public void mainMenu() throws SQLException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        int accountNumber;

        while (true) {
            System.out.println("Введите номер аккаунта ");
            accountNumber = scanner.nextInt();

            if (accountNumber <= 0 || accountNumber > 15) {
                System.out.println("Данного аккаунта нет");
                System.out.println("Введите корректный номер\n");

            } else {
                System.out.println("1. Баланс");
                System.out.println("2. Трансфер");
                System.out.println("3. Оплата услуг");
                System.out.println("0. Выход");
                System.out.println("Выберите услугу: ");


                int choice = scanner.nextInt();
                scanner.nextLine();

                if (accountNumber >= 1 && accountNumber <= 5) {
                    switch (choice) {
                        case 1:
                            db.SelectFromTable("basicclient", accountNumber);
                            break;
                        case 2:


                            break;
                        case 3:
                            System.out.println("Оплата услуг");
                            break;
                        case 0:
                            System.out.println("Выход.");
                            return;
                        default:
                            System.out.println("Неверный выбор.");
                    }

                }

                if (accountNumber >= 6 && accountNumber <= 10) {
                    switch (choice) {
                        case 1:
                            db.SelectFromTable("premiumclient", accountNumber);
                            break;
                        case 2:
                            System.out.println("Трансфер");
                            break;
                        case 3:
                            System.out.println("Оплата услуг");
                            break;
                        case 0:
                            System.out.println("Выход.");
                            return;
                        default:
                            System.out.println("Неверный выбор.");
                    }

                }

                if (accountNumber >= 11 && accountNumber <= 15) {
                    switch (choice) {
                        case 1:
                            db.SelectFromTable("vipclient", accountNumber);
                            break;
                        case 2:
                            System.out.println("Трансфер");
                            break;
                        case 3:
                            System.out.println("Оплата услуг");
                            break;
                        case 0:
                            System.out.println("Выход.");
                            return;
                        default:
                            System.out.println("Неверный выбор.");
                    }

                }

            }






        }
    }
}
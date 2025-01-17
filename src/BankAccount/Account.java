package BankAccount;

import java.util.Random;

public class Account {
    private String accountNumber;
    private double balance;


    public Account(String accountNumber, double balance) {
        this.accountNumber = generateNumber();
        this.balance = balance;

    }

    private String generateNumber() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            builder.append(random.nextInt(9));


        }
        return builder.toString();
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

public static void transferMoney(Account sender, Account recipient, double amount) {
        if(sender == null || recipient == null) {
            throw new IllegalArgumentException("не может быть пустым");
        }
        if(amount <=0) {
            throw new IllegalArgumentException("должно быть больше нуля");
        }
        sender.withdraw(amount);
        recipient.addToBalance(amount);
    }

    public void addToBalance(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("должно быть больше нуля");
        }
        this.balance += amount;

    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("должно быть больше нуля");
        }
        this.balance -= amount;
    }
    private static void payService(Client client, double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("должно быть больше нуля");
        }
        client.getAccount().withdraw(amount);
        if (client.getAccount().getBalance() == 1000) {
            client.getAccount().addToBalance(1000);
            System.out.println("бонус зачислен");
        }
        double cashbackAmount = client.calculateCashback(amount);
        client.getAccount().addToBalance(cashbackAmount);
    }



    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}


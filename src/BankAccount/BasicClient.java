package BankAccount;

class BasicClient extends Client {
    private static final double MONTHLY_FEE = 100;
    private static final double CASHBACK_THRESHOLD = 10000;
    private static final double CASHBACK_RATE = 0.01;

    public BasicClient(String fullName, String accountNumber, double balance) {
        super(fullName, accountNumber, balance, ClientType.BASIC);
    }

    @Override
    public void applyMonthlyFee() {
        getAccount().withdraw(MONTHLY_FEE);
    }

    @Override
    public double calculateCashback(double amount) {
        if (amount >= CASHBACK_THRESHOLD) {
            return amount * CASHBACK_RATE;
        }
        return 0;
    }

}



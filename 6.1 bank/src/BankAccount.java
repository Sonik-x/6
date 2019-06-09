public class BankAccount {
    private double balance = 1000;
    private double commission = 0;

    public void putMoney(int amount) {
        balance += amount;
        System.out.println("Деньги зачислены на счёт!");
    }

    public void withdraw(int amount) {
        double comAmount = amount * commission;
        if (balance < amount + comAmount) {
            System.out.println("Недостаточно денег на счету.");
            return;
        }

        //if (Math.abs(comission) < 0.00000001) {    -- можно так, но это вроде излищне тут
        if (commission != 0) {
            System.out.printf("Комиссия составила %.2f рублей", comAmount);
            System.out.println();
        }
        balance -= (amount + comAmount);
        System.out.println("Пожалуйста, заберите деньги и карту.");
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.printf("Ваш баланс: %.2f рублей.", balance);
        System.out.println();
    }

    void setCommission(float com) {
        commission = com;
    }
}

public class BankAccount {
    private double balance = 1000;
    private float commission = 0;

    public void putMoney(int amount) {
        balance += amount;
        System.out.println("Деньги зачислены на счёт!");
    }

    public void withdraw(int amount) {
        float comAmount = amount* commission;
        if (balance < amount + comAmount) {
            System.out.println("Недостаточно денег на счету.");
            return;
        }
        if(comAmount != 0.0f){
            System.out.println("Комиссия составила " + comAmount + " рублей");
        }
        balance -= (amount + comAmount);
        System.out.println("Пожалуйста, заберите деньги и карту.");
    }

    public double getBalance() {
        return balance;
    }

    public void printBalance() {
        System.out.println("Ваш баланс: " + balance + " рублей.");
    }

    void setCommission(float com){
        commission = com;
    }
}

import java.math.BigDecimal;
import java.text.DecimalFormat;

public abstract class Client {
    private BigDecimal balance = new BigDecimal("1000.00");
    private final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("#.00");

    public void putMoney(int amount) {
        BigDecimal am = BigDecimal.valueOf(amount);
        balance = balance.add(am);
        System.out.println("Деньги зачислены на счёт!");
    }

    void putMoney(int amount, BigDecimal commission) {
        if (commission.compareTo(new BigDecimal("1")) >= 0) {
            System.out.println("Error! Incorrect commission amount.");
            return;
        }
        BigDecimal amountBD = BigDecimal.valueOf(amount);
        BigDecimal comAmount = commission.multiply(amountBD);
        BigDecimal depAmount = amountBD.subtract(comAmount);
        balance = balance.add(depAmount);
        System.out.println("Комиссия составила " + DECIMAL_FORMAT.format(comAmount) + " рублей, " + DECIMAL_FORMAT.format(depAmount) + " рублей зачислено на счёт.");
        accuracy();
    }


    public void withdraw(int amount) {
        BigDecimal amountBD = BigDecimal.valueOf(amount);
        if (balance.compareTo(amountBD) < 0) {
            System.out.println("Недостаточно денег на счету.");
            return;
        }
        balance = balance.subtract(amountBD);
        System.out.println("Пожалуйста, заберите деньги и карту.");
    }

    void withdraw(int amount, BigDecimal commission) {
        BigDecimal amountBD = BigDecimal.valueOf(amount);
        BigDecimal comAmount = amountBD.multiply(commission);
        if (balance.compareTo(amountBD.add(comAmount)) < 0) {
            System.out.println("Недостаточно денег на счету.");
            return;
        }

        System.out.println("Комиссия составила " + DECIMAL_FORMAT.format(comAmount) + " рублей");

        balance = balance.subtract(amountBD).subtract(comAmount);
        System.out.println("Пожалуйста, заберите деньги и карту.");
        accuracy();
    }


    public void printBalance() {
        System.out.println("Ваш баланс: " + DECIMAL_FORMAT.format(balance) + " рублей.");
    }

    public BigDecimal getBalance() {
        return balance;
    }

    private void accuracy() {               //потому что мы не можем хранить на счету доли копеек
        balance = balance.setScale(2, BigDecimal.ROUND_HALF_EVEN);
    }
}

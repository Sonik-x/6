import java.math.BigDecimal;

public class Entrepreneur extends Client {

    private final BigDecimal COMMISSION_SMALLER_DEPOSIT = new BigDecimal("0.01");
    private final BigDecimal COMMISSION_BIGGER_DEPOSIT = new BigDecimal("0.005");
    private final int SMALLER_DEPOSIT_BOARDER = 1000;

    public void putMoney(int amount) {
        if (amount < SMALLER_DEPOSIT_BOARDER) {
            super.putMoney(amount, COMMISSION_SMALLER_DEPOSIT);
        } else {
            super.putMoney(amount, COMMISSION_BIGGER_DEPOSIT);
        }
    }
    // пополнение с комиссией 1%, если сумма меньше 1000 рублей, и 0,5%, если сумма больше либо равна 1000 рублей.
}

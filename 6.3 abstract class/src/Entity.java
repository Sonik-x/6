import java.math.BigDecimal;

public class Entity extends Client {
    private final BigDecimal WITHDRAW_COMMISSION = new BigDecimal("0.01");

    public void withdraw(int amount) {
        super.withdraw(amount, WITHDRAW_COMMISSION);
    }

    //снятие с комиссией 1%

}

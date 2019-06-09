import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DepositAccount extends BankAccount {
    private final int WITHDRAW_LIMIT = 30; //days
    private LocalDateTime depositTime;

    private DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public DepositAccount() {
        depositTime = LocalDateTime.of(1, 1, 1, 1, 1);
    }

    @Override
    public void putMoney(int amount) {
        super.putMoney(amount);
        depositTime = LocalDateTime.now();
    }

    @Override
    public void withdraw(int amount) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate whenAvailable = depositTime.toLocalDate();
        whenAvailable = whenAvailable.plusDays(WITHDRAW_LIMIT);
        if (!whenAvailable.isBefore(ChronoLocalDate.from(now))) {
            System.out.println("Вы не можете снимать деньги со счёта до " + whenAvailable.format(dateFormat));
            return;
        }
        super.withdraw(amount);
    }
}

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DepositAccount extends BankAccount {
    //private long lastDepositTime = 0;
    //private final long ONE_DAY = 86400000;
    private int withdrawLimit = 30; //days
    private Calendar depositTime = Calendar.getInstance(); //это чтобы не получить nullpointer, а задаём всё равно в конструкторе

    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    public DepositAccount(){
        super();
        depositTime.set(1,1,1);
    }

    @Override
    public void putMoney(int amount) {
        super.putMoney(amount);
        depositTime = Calendar.getInstance();    //текущее время
        //lastDepositTime = System.currentTimeMillis();
    }

    @Override
    public void withdraw(int amount) {
        Calendar now = Calendar.getInstance();
        Calendar whenAvailable = (Calendar)depositTime.clone();
        whenAvailable.add(Calendar.DATE, withdrawLimit);
        if (!whenAvailable.before(now)){
            System.out.println("Вы не можете снимать денег со счёта до " + dateFormat.format(whenAvailable.getTime()));
            return;
        }
        super.withdraw(amount);
    }
}

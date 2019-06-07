public class CardAccount extends BankAccount {

    private final float COMISSION = 0.01f;

    public CardAccount(){
        super();
        setCommission(COMISSION);
    }
}

public class Loader {
    public static void main(String[] args) {
        BankAccount depositAccount = new DepositAccount();
        depositAccount.printBalance();
        depositAccount.withdraw(100);
        depositAccount.printBalance();
        depositAccount.withdraw(250);
        depositAccount.printBalance();
        depositAccount.putMoney(400);
        depositAccount.printBalance();
        depositAccount.withdraw(100);
        depositAccount.printBalance();

        System.out.println();
        System.out.println();

        CardAccount account = new CardAccount();
        account.printBalance();
        account.withdraw(100);
        account.printBalance();
        account.withdraw(250);
        account.printBalance();
        account.putMoney(400);
        account.printBalance();
        account.withdraw(100);
        account.printBalance();

        System.out.println();
        System.out.println();

        BankAccount bankAccount = new BankAccount();
        bankAccount.printBalance();
        bankAccount.withdraw(100);
        bankAccount.printBalance();
        bankAccount.withdraw(250);
        bankAccount.printBalance();
        bankAccount.putMoney(400);
        bankAccount.printBalance();
        bankAccount.withdraw(100);
        bankAccount.printBalance();
    }
}

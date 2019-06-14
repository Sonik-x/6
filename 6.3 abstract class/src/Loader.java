public class Loader {
    public static void main(String[] args) {


        // копипаст-ориентированное тестирование :D

        Client depositAccount = new Individual();
        depositAccount.printBalance();
        depositAccount.withdraw(111);
        depositAccount.printBalance();
        depositAccount.withdraw(250);
        depositAccount.printBalance();
        depositAccount.putMoney(400);
        depositAccount.printBalance();
        depositAccount.withdraw(100);
        depositAccount.printBalance();

        System.out.println();
        System.out.println();

        Entity account = new Entity();
        account.printBalance();
        account.withdraw(100);
        account.printBalance();
        account.withdraw(250);
        account.printBalance();
        account.putMoney(444);
        account.printBalance();
        account.withdraw(111);
        account.printBalance();

        System.out.println();
        System.out.println();

        Entrepreneur bankAccount = new Entrepreneur();
        bankAccount.printBalance();
        bankAccount.withdraw(100);
        bankAccount.printBalance();
        bankAccount.withdraw(250);
        bankAccount.printBalance();
        bankAccount.putMoney(400);
        bankAccount.printBalance();
        bankAccount.putMoney(4444);
        bankAccount.printBalance();
        bankAccount.withdraw(100);
        bankAccount.printBalance();

        System.out.println();
        System.out.println(depositAccount.getBalance().toString());
        System.out.println(account.getBalance().toString());
        System.out.println(bankAccount.getBalance());


    }
}

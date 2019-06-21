public class SaleManager extends Worker {
    private static final double BONUS_PERCENT = 0.05;
    private int bonus;

    public SaleManager(int salary) {
        fixedSalary = salary;
    }

    public void earnMoney(int income) {   // только сэйл может заработать для компании данег (вроде это так и работает)
        if(!Company.stuff.contains(this)){
            bonus += income;
            return;
        }
        Company.income += income;
        bonus += (int)(income * BONUS_PERCENT);
    }

    @Override
    public int getMonthSalary() {
        return fixedSalary + bonus;
    }
}

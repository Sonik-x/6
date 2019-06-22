public class SaleManager extends Company.Worker {
    private static final double BONUS_PERCENT = 0.05;
    private int bonus;

    SaleManager(int salary) {
        fixedSalary = salary;
    }

    void earnMoney(int income) {
        if(!isHired()){
            bonus += income;
            return;
        }
        Company.addIncome(income);
        bonus += (int)(income * BONUS_PERCENT);
    }

    @Override
    public int getMonthSalary() {
        return fixedSalary + bonus;
    }
}

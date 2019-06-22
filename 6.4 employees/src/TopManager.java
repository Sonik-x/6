public class TopManager extends Company.Worker {

    private int bonus;

    TopManager(int salary) {
        fixedSalary = salary;
        bonus = 10000;
    }

    TopManager(int salary, int bonus) {
        fixedSalary = salary;
        this.bonus = bonus;
    }

    @Override
    public int getMonthSalary() {
        if (Company.getIncome() > 10000000) {
            return fixedSalary + bonus;
        }
        return fixedSalary;
    }

}

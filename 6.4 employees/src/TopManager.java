public class TopManager extends Worker {

    private int bonus;

    public TopManager(int salary) {
        fixedSalary = salary;
        bonus = 10000;
    }

    public TopManager(int salary, int bonus) {
        fixedSalary = salary;
        this.bonus = bonus;
    }

    @Override
    public int getMonthSalary() {
        if (Company.income > 10000000) {
            return fixedSalary + bonus;
        }
        return fixedSalary;
    }

}

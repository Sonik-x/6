public class OperationsOfficer extends Worker {

    public OperationsOfficer(int salary) {
        fixedSalary = salary;
    }

    @Override
    public int getMonthSalary() {
        return fixedSalary;
    }

}

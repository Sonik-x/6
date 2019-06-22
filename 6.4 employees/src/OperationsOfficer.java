public class OperationsOfficer extends Company.Worker {

    OperationsOfficer(int salary) {
        fixedSalary = salary;
    }

    @Override
    public int getMonthSalary() {
        return fixedSalary;
    }

}

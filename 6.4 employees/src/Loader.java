import java.util.ArrayList;

public class Loader {
    public static void main(String[] args) {

        // HR-ов в компании нет, поэтому зарплаты будем платить не очень эффеективно

        for (int i = 0; i < 100; i++) {
            Worker employee = new OperationsOfficer(10000 + (int)(Math.random()*40000));
            employee.hire();
        }

        for (int i = 0; i < 140; i++) {
            SaleManager employee = new SaleManager(10000);
            employee.hire();
            employee.earnMoney((int)(Math.random()*2700000));
        }

        for (int i = 0; i < 30; i++) {
            Worker employee = new TopManager(40000 + (int)(Math.random()*100000));
            employee.hire();
        }

        Company.printIncome();

        ArrayList<Employee> lowList = Company.getLowestSalaryStaff(10);
        ArrayList<Employee> topList = Company.getTopSalaryStaff(5);

        System.out.println();
        for(Employee emp : lowList){
            System.out.println(emp.getMonthSalary() + " - " + emp.getClass());
        }

        System.out.println();

        for(Employee emp : topList){
            System.out.println(emp.getMonthSalary() + " - " + emp.getClass());
        }


    }
}

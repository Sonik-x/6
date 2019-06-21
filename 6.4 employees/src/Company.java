import java.util.ArrayList;

public class Company {

    protected static long income;
    protected static ArrayList<Employee> stuff = new ArrayList<>();


    protected static ArrayList<Employee> getTopSalaryStaff(int count) {
        ArrayList<Employee> result = new ArrayList<>();
        EmployeeComparator c = new EmployeeComparator();
        stuff.sort(c);

        for (int i = stuff.size() - 1; i >= stuff.size() - count; i--) {
            result.add(stuff.get(i));
        }

        return result;
    }

    protected static ArrayList<Employee> getLowestSalaryStaff(int count) {
        ArrayList<Employee> result = new ArrayList<>();
        EmployeeComparator c = new EmployeeComparator();
        stuff.sort(c);

        for (int i = 0; i < count; i++) {
            result.add(stuff.get(i));
        }

        return result;
    }

    public static void printIncome() {
        System.out.println("This month`s income: " + income);
    }


}

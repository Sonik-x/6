import java.util.ArrayList;
import java.util.Comparator;

public class Company {

    private static long income;
    private static ArrayList<Worker> stuff = new ArrayList<>();


    static ArrayList<Worker> getTopSalaryStaff(int count) {
        ArrayList<Worker> result = new ArrayList<>();
        stuff.sort(Comparator.comparing(Worker::getMonthSalary).reversed());

        int a = Math.min(count, stuff.size());
        for (int i = 0; i < a; i++) {
            result.add(stuff.get(i));
        }

        return result;
    }

    static ArrayList<Worker> getLowestSalaryStaff(int count) {
        ArrayList<Worker> result = new ArrayList<>();
        stuff.sort(Comparator.comparing(Worker::getMonthSalary));

        int a = Math.min(count, stuff.size());
        for (int i = 0; i < a; i++) {
            result.add(stuff.get(i));
        }

        return result;
    }

    public static void printIncome() {
        System.out.println("This month`s income: " + income);
    }

    static void addIncome(int add){
        income += add;
    }

    static long getIncome(){
        return income;
    }


    public static abstract class Worker {
        int fixedSalary;

        void hire() {
            if (isHired()) {
                System.out.println("this person is already hired");
                return;
            }
            Company.stuff.add(this);
        }

        void fire() {
            if (isHired()) {
                stuff.remove(this);
                return;
            }
            System.out.println("this person is not our employee");

        }

        boolean isHired() {
            return stuff.contains(this);
        }

        public abstract int getMonthSalary();

    }


}

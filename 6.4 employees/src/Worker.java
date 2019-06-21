public abstract class Worker implements Comparable<Worker>, Employee {
    //потому что DRY

    int fixedSalary;

    public void hire() {
        if (Company.stuff.contains(this)) {
            System.out.println("this person is already hired");
            return;
        }
        Company.stuff.add(this);
    }

    public void fire() {
        if (Company.stuff.contains(this)) {
            Company.stuff.remove(this);
            return;
        }
        System.out.println("this person is not our employee");

    }


    @Override
    public int compareTo(Worker o) {   // я в итоге использую Comparator, но пусть будет тут тоже
        return getMonthSalary() - o.getMonthSalary();
    }
}

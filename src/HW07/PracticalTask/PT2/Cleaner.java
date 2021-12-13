package HW07.PracticalTask.PT2;

public class Cleaner extends Staff {
    private final String TYPE_PERSON = "Cleaner";

    public Cleaner(String name, double salary) {
        setName(name);
        setSalary(salary);
        System.out.println("Object type " + TYPE_PERSON + " was created.");
    }

    @Override
    double salary() {
        return getSalary();
    }

}

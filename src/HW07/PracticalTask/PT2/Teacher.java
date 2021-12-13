package HW07.PracticalTask.PT2;

public class Teacher extends Staff {
    private final String TYPE_PERSON = "Teacher";

    public Teacher(String name, double salary) {
        setName(name);
        setSalary(salary);
        System.out.println("Object type " + TYPE_PERSON + " was created.");
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    double salary() {
        return getSalary();
    }

}

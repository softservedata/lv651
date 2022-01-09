package homework.hw07.practicaltasks.task2;

public class Student extends Person{

    final String TYPE_PERSON = "Student";

    public Student() {
    }

    public Student(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\tI am a " + TYPE_PERSON);
    }

    @Override
    public String toString() {
        return "Student{" + getName() + "}";
    }
}

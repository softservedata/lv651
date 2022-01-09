package homework.hw07.practicaltasks.task2;

public class Teacher extends Staff{

    final String TYPE_PERSON = "Teacher";

    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.println("\tI am a " + TYPE_PERSON);
    }

    @Override
    public void salary() {
        System.out.println("\t" + getName() + ".salary");
    }

    @Override
    public String toString() {
        return "Teacher{" + getName() + '}';
    }
}

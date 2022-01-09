package homework.hw07.practicaltasks.task2;

public class Cleaner extends Staff{

    final String TYPE_PERSON = "Cleaner";

    public Cleaner() {
    }

    public Cleaner(String name) {
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
        return "Cleaner{" + getName() + '}';
    }
}

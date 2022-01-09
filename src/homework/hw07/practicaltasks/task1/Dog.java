package homework.hw07.practicaltasks.task1;

public class Dog implements Animal{

    private String name;

    @Override
    public String feed() {
        return name+".feed()";
    }

    @Override
    public String voice() {
        return name+".voice()";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        this.name = "";
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

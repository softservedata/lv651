package homework.hw08.tasks.task1;

public class Student extends Person{

    private int courseIsTaking;

    public Student(FullName fullName, int age, int courseIsTaking) {
        super(fullName, age);
        this.courseIsTaking = courseIsTaking;
    }

    @Override
    public String info() {
        return "First name: " + getFullName().getFirstName() + ", Last name: " + getFullName().getLastName() + ", Age: " + getAge() + ", Course is taking: " + courseIsTaking;
    }

    @Override
    public String activity() {
        return "I study at the university";
    }
}

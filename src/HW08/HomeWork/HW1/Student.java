package HW08.HomeWork.HW1;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    public Student(String firstName, String lastName, int age, int course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return "Student{" +
                "firstName=" + fullName.firstName +
                " ,lastName=" + fullName.lastName +
                ", age=" + age +
                ", course=" + course +
                '}';
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

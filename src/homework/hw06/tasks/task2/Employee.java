package homework.hw06.tasks.task2;

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
        this.name = "";
        this.age = 0;
        this.salary = 0;
    }

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String report() {
        String s = "Name: " + name + ", Age: " + age + " years, Salary: " + salary;
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

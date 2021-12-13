package HW07.PracticalTask.PT2;

public abstract class Staff extends Person {
    private double salary;

    abstract double salary();

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.print("I am a " + getName() + ".");
    }

}

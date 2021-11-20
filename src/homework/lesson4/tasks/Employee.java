package homework.lesson4.tasks;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    private static int totalSum;


    public Employee() {
        this.name = "";
        this.rate = 0;
        this.hours = 0;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getHours() {
        return hours;
    }

    public double getSalary() {
        return rate*hours;
    }

    public double getBonuses() {
        return rate*hours*0.1;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void changeRate(int rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name
                + ", rate=" + rate
                + ", hours=" + hours
                + "]";
    }
}

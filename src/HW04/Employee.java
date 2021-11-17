package HW04;

public class Employee {
    private String name;
    private int rate;           //rate per hour
    private int hours;          //hours per day
    private static int totalSum;//salary all workers per hour

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        hours = 8;
        totalSum += getSalary();
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += getSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public static int getTotalSum() {
        return totalSum;
    }

    public int getSalary() {
        return rate * hours;
    }

    public void changeRate(int rate){
        totalSum -= getSalary();
        setRate(rate);
        totalSum += getSalary();
    }

    public double getBonuses(){
        return getSalary() * 0.1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "'" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", salary=" + getSalary() +
                '}';
    }
}

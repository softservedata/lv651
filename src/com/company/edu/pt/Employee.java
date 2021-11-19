package com.company.edu.pt;
public class Employee {
    private String name;
    private int rate;
    private Float hours;
    private static float totalSum;

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public Float getHours() {
        return hours;
    }

    public static void getTotalSum(float...salaries ) {
        float slrs=0;
        for(int i=0; i< salaries.length; i++){
            slrs=slrs+salaries[i];

            }System.out.println("Total Sum:"+slrs);


    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setHours(Float hours) {
        this.hours = hours;
    }

    public static void setTotalSum(float totalSum) {
        Employee.totalSum = totalSum;
    }

    public Employee() {
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, Float hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public float getSalary(){
    float salary=rate*hours;
    return salary;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public int changeRate(int Rate){
        this.rate=Rate;
        getSalary();
        return rate;
    }
    public float getBonuses(){
        float Bonus=getSalary()*0.1f;
        System.out.println("Salary with bonus:"+Bonus+"$-"+(getSalary()+Bonus));
        return Bonus;
    }

    public static void main(String[] args) {
        Employee Worker1 = new Employee("Nestor",3);
        Worker1.setHours(8.3f);
        System.out.println(Worker1.toString());
        System.out.println("Salary :"+Worker1.getSalary()+"$");
        Employee Worker2 = new Employee("Pavlo",5, 4.8f);
        System.out.println(Worker2.toString());
        System.out.println("Salary:"+Worker2.getSalary()+"$");
        Employee Worker3 = new Employee();
        Worker3.setName("Petro");
        Worker3.setRate(2);
        Worker3.setHours(6.2f);
        System.out.println(Worker3.toString());
        Worker3.getBonuses();
        getTotalSum(Worker1.getSalary(),Worker2.getSalary(), Worker3.getBonuses()+Worker3.getSalary());
    }
}



package HW06.HomeWork;

public class HW_2 {
    /*
    Support we have a class Employee
    Create a Developer class that extends the Employee class.
    Creates a String field and a constructor to initialize all fields in the Developer class.

    Also in the Developer class, override the method report() so that it returns a string with
    information about the developer, for example:
    Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
    If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
    Create an instance of the Employee and Developer class and print in the console information about them using report() method.
    */

    public static void main(String[] args) {
        Employee[] company = {
                new Employee("Ivan", 24, 27000.00),
                new Developer("Taras", "Average Java developer", 32, 32735.35),
                new Developer("Stepan", "Junior Java developer", 22, 20345.75)
        };

        printEmployeeList(company);
    }

    private static void printEmployeeList(Employee[] company) {
        for (Employee e : company) {
            System.out.println(e.report());
        }
    }
}

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String report() {
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age, salary);
    }
}

class Developer extends Employee {
    private String position;

    public Developer(String name, String position, int age, double salary) {
        super(name, age, salary);
        this.position = position;
    }


    @Override
    public String report() {
        return String.format("Name: %s, Position: %s, Age: %d, Salary: \u20B4 %.2f.", getName(), position, getAge(), getSalary());
    }
}
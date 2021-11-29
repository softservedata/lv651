package homework.lesson4.tasks;

public class Appl {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Vitalik", 159, 88);
        Employee employee2 = new Employee("Bohdan", 103, 57);
        Employee employee3 = new Employee("Pavlo", 160, 100);
        System.out.println("#1: " + employee1.getName() + "(salary " + employee1.getSalary() + ", bonuses " + employee1.getBonuses() + ")");
        System.out.println("#2: " + employee2.getName() + "(salary " + employee2.getSalary() + ", bonuses " + employee2.getBonuses() + ")");
        System.out.println("#3: " + employee3.getName() + "(salary " + employee3.getSalary() + ", bonuses " + employee3.getBonuses() + ")");
    }
}

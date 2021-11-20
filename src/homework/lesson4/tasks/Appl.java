package homework.lesson4.tasks;

public class Appl {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.setName("Vitalik");
        employee2.setName("Bohdan");
        employee3.setName("Pavlo");
        employee1.setHours(159);
        employee2.setHours(103);
        employee3.setHours(160);
        employee1.setRate(88);
        employee2.setRate(57);
        employee3.setRate(100);
        System.out.println("№1: " + employee1.getName() + "(salary " + employee1.getSalary() + ", bonuses " + employee1.getBonuses() + ")");
        System.out.println("№2: " + employee2.getName() + "(salary " + employee2.getSalary() + ", bonuses " + employee2.getBonuses() + ")");
        System.out.println("№3: " + employee3.getName() + "(salary " + employee3.getSalary() + ", bonuses " + employee3.getBonuses() + ")");
    }
}

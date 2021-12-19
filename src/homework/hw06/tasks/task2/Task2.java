package homework.hw06.tasks.task2;

public class Task2 {
    public static void main(String[] args) {
        Employee enm1 = new Employee("Taras", 24, 34000.25);
        Employee enm2 = new Developer("Bohdan", 25, 34500.20, "Average Java developer");
        System.out.println(enm1.report());
        System.out.println(enm2.report());
    }
}

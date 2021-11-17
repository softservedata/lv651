package HW04;

public class MainEmployee {
    public static void main(String[] args) {
        Employee wTom = new Employee("Tom", 100);
        Employee wJohn = new Employee("John", 200, 8);
        Employee wMax = new Employee("Max", 500, 8);

        System.out.println(wTom);
        System.out.println(wJohn);
        System.out.println(wMax);

        System.out.println("\nTotal salary: " + Employee.getTotalSum());

        wTom.changeRate(300);
        System.out.println("\nToms salary is 300$ per hour now");
        System.out.println(wTom);
        System.out.println("\nTotal salary: " + Employee.getTotalSum());

        System.out.println("\nJohn has a bonus: " + wJohn.getBonuses());
    }
}

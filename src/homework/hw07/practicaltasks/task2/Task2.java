package homework.hw07.practicaltasks.task2;

public class Task2 {
    public static void main(String[] args) {
        Person[] persons = {
                new Student("Bob"),
                new Student("Anton"),
                new Teacher("Bohdan"),
                new Teacher("Olivia"),
                new Cleaner("Igor"),
                new Cleaner("Oleh")
        };

        for (Person person : persons) {
            System.out.println(person);
            person.print();
            if (person instanceof Staff) ((Staff) person).salary();
            System.out.println("\n");
        }
    }
}

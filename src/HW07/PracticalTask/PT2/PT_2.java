package HW07.PracticalTask.PT2;

public class PT_2 {
    /*
    Create next structure. In abstract class Person with property name, declare abstract method print().
    In other classes in body of method print() output text “I am a …”. In class Staff declare abstract method salary().
    In each concrete class create constant TYPE_PERSON. Output type of person in each constructors.
    Create array of Person and add some Teachers, Cleaners and Students to it. Call method print() for all of it.
    Call method salary() for all Teachers and Cleaner
     */
    public static void main(String[] args) {
        Person[] uni = new Person[]{
                new Teacher("Oksana Zabuzhko", 28000),
                new Teacher("Irena Karpa", 30000),
                new Teacher("Yuri Andrukhovych", 28000),
                new Teacher("Serhiy Zhadan", 27000),
                new Cleaner("Suzanna", 20000),
                new Student("Alina Pash", "Vocal"),
                new Student("Monatic", "Brake Dance"),
                new Student("Khrystyna Soloviy", "Vocal")
        };

        printList(uni);
    }

    private static void printList(Person[] uni) {
        System.out.println("\nList all persons:");

        for (Person p : uni) {
            p.print();
            if (p instanceof Staff) System.out.println(" My salary is:" + ((Staff) p).getSalary());
            if (p instanceof Student) System.out.println(" (" + ((Student) p).getGroupName() + ")");
        }

    }
}



package homework.hw08.tasks.task1;

public class Task1 {
    public static void main(String[] args) {
        Student student1 = new Student(new Person.FullName("Petro", "Petrov"), 18, 2);
        Student student2 = new Student(new Person.FullName("Oleh", "Vasilenko"), 20, 4);
        System.out.println("student1.info(): \n\t" + student1.info() + "\nstudent1.activity(): \n\t" + student1.activity() + "\n");
        System.out.println("student2.info(): \n\t" + student2.info() + "\nstudent2.activity(): \n\t" + student2.activity() + "\n");
    }
}

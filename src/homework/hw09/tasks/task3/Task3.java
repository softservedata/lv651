package homework.hw09.tasks.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Orest", 2));
        students.add(new Student("Olia", 3));
        students.add(new Student("Ihor", 1));
        students.add(new Student("Anna", 3));
        students.add(new Student("Bohdan", 4));
        System.out.println(students);

        System.out.println("\nStudents sorted by name: ");
        students.sort(new Student.byName());
        System.out.println(students);

        System.out.println("\nStudents sorted by course: ");
        students.sort(new Student.byCourse());
        System.out.println(students);

        System.out.println("\nprintStudents(students, 2): ");
        new Student().printStudents(students, 2);

    }
}

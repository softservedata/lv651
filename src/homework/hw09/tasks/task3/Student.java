package homework.hw09.tasks.task3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private int course;

    // Comparators
    public static class byName implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            return student1.getName().compareTo(student2.getName());
        }
    }

    public static class byCourse implements Comparator<Student> {
        public int compare(Student student1, Student student2) {
            return student1.getCourse() - student2.getCourse();
        }
    }

    // Constructors
    public Student() {
        this.name = "";
        this.course = 0;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }


    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    // ---------------------------

    public void printStudents (List<Student> students, int course) {
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String toString() {
        return "\nStudent {" +
                "name = " + name +
                ", course = " + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return getName().compareTo(o.getName());
    }
}

package HW09.HomeWork.HW3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

public class Student implements Comparable<Student> {
    public static void printStudents(ArrayList<Student> students) {
        Iterator i = students.iterator();
        while (i.hasNext()){
            Student student = (Student) i.next();
            System.out.println("Name :" + student.getName() + ", course:" + student.getCourse());
        }
    }

    public static Comparator<Student> compNameAsc;
    public static Comparator<Student> compNameDesc;
    public static Comparator<Student> compCourseAsc;
    static {
        compNameAsc = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s1.getName().toUpperCase().compareTo(s2.getName());
            }
        };

        compNameDesc = (s1, s2) -> s2.getName().toUpperCase().compareTo(s1.getName());

        compCourseAsc = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return Integer.compare(s2.getCourse(), s1.getCourse());
            }
        };
    }



    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

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

    @Override
    public String toString() {
        return "\nStudent{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }

    @Override
    public int compareTo(Student o) {
        return this.getName().toUpperCase().compareTo(o.getName());
    }
}

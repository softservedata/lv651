package HW09.HomeWork.HW3;

import java.util.*;

public class HW3 {
    /*
    Write class Student that provides information about the name of the student and his course.
    Class Student should consist of
            - properties for access to these fields
            - constructor with parameters
            - method printStudents (List students, Integer course), which receives a list of students
            and the course number and prints to the console the names of the students from the list,
            which are taught in this course (use an iterator)
            - methods to compare students by name and by course
            - In the main() method
                - declare List students and add to the list five different students
                - display the list of students ordered by name
                - display the list of students ordered by course
     */
    public static void main(String[] args) {

        ArrayList<Student> uni = new ArrayList<>(
                Arrays.asList(new Student("Ivan", 1),
                            new Student("Stepan", 2),
                            new Student("Roman",2),
                            new Student("Taras",1),
                            new Student("Bogdan",3),
                            new Student("Orest",3)));
        System.out.println(uni);

        uni.sort((s1, s2) -> s1.getCourse() - s2.getCourse());
        System.out.println(uni);

//        uni.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//                return s1.getName().toUpperCase().compareTo(s2.getName());
//            }
//        });
        //Sort Example 1
        //-uni.sort((s1, s2) -> s1.getName().toUpperCase().compareTo(s2.getName()));
        //Sort Example 2
        //Collections.sort(uni,Student.compNameDesc);
        //Sort Example 3
        Collections.sort(uni);
        //System.out.println(uni);
        Student.printStudents(uni);
    }

}

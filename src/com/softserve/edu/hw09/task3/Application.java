package com.softserve.edu.hw09.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List <Student> list = new ArrayList<Student>();
        list.add(new Student("Ivan Petrov",1));
        list.add(new Student("Iryna Koval",4));
        list.add(new Student("Ihor Smola",5));
        list.add(new Student("Anna Kit",1));
        list.add(new Student("Mykola Makarenko",2));
        list.get(0).printStudents(list,1 );
        list.sort(new CourseComparator());
        System.out.println(list);
        list.sort(new NameComparator());
        System.out.println(list);



    }


}

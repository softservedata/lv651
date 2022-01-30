package com.company.edu.hw9.task3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Student> list = new LinkedList<>();
        list.add(new Student(2,"Oleg"));
        list.add(new Student(2,"Nestor"));
        list.add(new Student(3,"Volodya"));
        list.add(new Student(4,"Pavlo"));
        list.add(new Student(5,"Hordii"));
        System.out.println("Your list:\n"+list);
        System.out.println("Enter what course you would like to see(1-5):");
        int course =sc.nextInt();
        list.get(0).printStudents(list, course);
        System.out.println("Your list, sorted by course:");
        Collections.sort(list, new Student.CompareByCourse());
        System.out.println(list+"\n");
        System.out.println("Your list, sorted by name:");
        Collections.sort(list, new Student.CompareByName());
        System.out.println(list+"\n");
    }
}

package com.softserve.collections.homework_3;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getName().compareTo(st2.getName());
    }
}

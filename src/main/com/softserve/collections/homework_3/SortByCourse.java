package com.softserve.collections.homework_3;

import java.util.Comparator;

public class SortByCourse implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        if (st1.getCourse() < st2.getCourse()) {
            return -1;
        }
        if (st1.getCourse() == st2.getCourse()) {
            return 0;
        }
        return 1;
    }
}

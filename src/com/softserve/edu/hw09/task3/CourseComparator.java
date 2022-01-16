package com.softserve.edu.hw09.task3;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
       return Integer.compare(o1.getCourse(), o2.getCourse());
    }
}

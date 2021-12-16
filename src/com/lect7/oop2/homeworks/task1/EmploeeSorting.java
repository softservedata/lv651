package com.lect7.oop2.homeworks.task1;

import java.util.Comparator;

class EmploeeSorting implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o2.getSalary(), o1.getSalary());
    }
}

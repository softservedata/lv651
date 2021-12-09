package com.softserve.arraysloops.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HomeworkTest {

    Homework homework;

    @BeforeEach
    private void init() {
        homework = new Homework();
    }

    @Test
    public void daysInMonth() {
        assertEquals(31, homework.daysInMonth(1));
        assertEquals(28, homework.daysInMonth(2));
        assertEquals(31, homework.daysInMonth(3));
        assertEquals(30, homework.daysInMonth(4));
        assertEquals(31, homework.daysInMonth(5));
        assertEquals(30, homework.daysInMonth(6));
        assertEquals(31, homework.daysInMonth(7));
        assertEquals(31, homework.daysInMonth(8));
        assertEquals(30, homework.daysInMonth(9));
        assertEquals(31, homework.daysInMonth(10));
        assertEquals(30, homework.daysInMonth(11));
        assertEquals(31, homework.daysInMonth(12));
    }

    @Test
    public void calculate() {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(15, homework.calculate(nums));

        int[] nums2 = new int[]{1, 2, 3, -4, 5, 6, 7, 8, 9, 10};
        assertEquals(40, homework.calculate(nums2));
    }

    @Test
    public void checkCars() {
        assertEquals(2008, homework.extractYearIfCarPresent(2008));
        assertEquals(2010, homework.extractYearIfCarPresent(2010));
        assertEquals(1996, homework.extractYearIfCarPresent(1996));
        assertEquals(2020, homework.extractYearIfCarPresent(2020));
        assertEquals(0, homework.extractYearIfCarPresent(545245326));
    }

    @Test
    public void secondPos() {
        int[] arr = new int[]{-1, -2, -3, 4, -5, -6, 7, 8, 9, 10};
        assertEquals(7, homework.secondPos(arr));
    }
}
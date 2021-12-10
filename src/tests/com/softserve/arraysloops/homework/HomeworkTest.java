package com.softserve.arraysloops.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


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
        int[] carArr = new int[]{2008,2010,1996,2020,0};

        assertEquals(carArr[0], homework.findCarByYear(2008).getYearProduction());
        assertEquals(carArr[1], homework.findCarByYear(2010).getYearProduction());
        assertEquals(carArr[2], homework.findCarByYear(1996).getYearProduction());
        assertEquals(carArr[3], homework.findCarByYear(2020).getYearProduction());
        assertNull(homework.findCarByYear(583798));
    }

    @Test
    public void secondPos() {
        int[] arr = new int[]{-1, -2, -3, 4, -5, -6, 7, 8, 9, 10};
        assertEquals(7, homework.secondPos(arr));
    }
}
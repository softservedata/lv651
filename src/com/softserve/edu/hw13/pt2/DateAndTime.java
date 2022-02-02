/*
* Show which today is a day of a week
* Show a date of first Monday for current month
 */

package com.softserve.edu.hw13.pt2;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.TemporalAdjusters;

import static java.time.temporal.TemporalAdjusters.firstInMonth;

public class DateAndTime {
    public static void main(String[] args) {


        long timeUnix = System.currentTimeMillis();



        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime:   " + currentDateTime.getDayOfWeek());
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date:       " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time:       " + currentTime);
        String myTime = new SimpleDateFormat("HH:mm:ss").format(timeUnix);
        System.out.println("Formated time:      " + myTime);


        LocalDate now = LocalDate.now();
        LocalDate firstMondayOfMonth = now.with(firstInMonth(DayOfWeek.MONDAY));
        System.out.println("firstMondayOfMonth: " + firstMondayOfMonth);





    }
}

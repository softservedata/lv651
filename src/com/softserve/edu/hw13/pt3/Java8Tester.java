package com.softserve.edu.hw13.pt3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

 public class Java8Tester {

    public static void main(String args[]) {
        Java8Tester java8tester = new Java8Tester();
        java8tester.testLocalDateTime();
    }

    public void testLocalDateTime() {
// Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime: " + currentDateTime);
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current DateTime: " + currentDate);
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current DateTime: " + currentTime);

// LocalDate date1 = currentDateTime.toLocalDate();
// System.out.println("date1: " + date1);
//
// Month month = currentDateTime.getMonth();
// int day = currentDateTime.getDayOfMonth();
// int seconds = currentDateTime.getSecond();
//
// System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
//
// LocalDate date2 = currentDate.withDayOfMonth(10).withMonth(4).withYear(2012);
// System.out.println("date2: " + date2);
//
// LocalDate date3 = LocalDate.of(2014, Month.DECEMBER, 15);
// System.out.println("date3: " + date3);
//
// //22 hour 15 minutes
// LocalTime date4 = LocalTime.of(22, 15);
// System.out.println("date4: " + date4);
    }
}

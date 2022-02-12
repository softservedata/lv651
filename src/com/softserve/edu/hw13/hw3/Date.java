package com.softserve.edu.hw13.hw3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalField;


public class Date {


    public static void main(String[] args) {


        LocalDate date = LocalDate.now();
        LocalDate date1 = LocalDate.now().minusDays(3);
        date.adjustInto(date);
        System.out.println(date1);
        System.out.println(((int) date.get(FunctionalInterface)));


    }

}

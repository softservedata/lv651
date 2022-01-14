package com.softserve.edu.hw10.regex;

public class HW2 {


    public static void main(String[] args) {

     String text = "I    am      learning     Java   Core.";
        String newText = text.replaceAll("\\s+", " ");
        System.out.println(newText);



    }
}

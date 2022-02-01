package com.softserve.edu.hw10;

public class Task2 {
    public static void main(String[] args) {

        String sentence = "I    am      learning     Java   Core";
        System.out.println("Before editing: " + sentence);
        sentence = sentence.trim();
        sentence = sentence.replaceAll("\\s+", " ");
        System.out.println("After editing: " + sentence);
    }
}

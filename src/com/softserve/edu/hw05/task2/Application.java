package com.softserve.edu.hw05.task2;

public class Application {
    public static void main(String[] args) {

        Dog pug = new Dog("Patrik", "pug", 6);

        Dog dalmatian = new Dog("Boss", "dalmatian", 7);

        Dog french_bulldog = new Dog("Bimo", "french_bulldog", 1);

        if (!pug.getName().equals(dalmatian.getName()) && (!pug.getName().equals(french_bulldog.getName()))
                && (!french_bulldog.getName().equals(dalmatian.getName()))) {
            System.out.println("All dog's names are unique");
        } else {
            System.out.println("There are duplicates in dog's names");
        }
        int maxAge = Math.max(pug.getAge(), Math.max(dalmatian.getAge(), french_bulldog.getAge()));

        if (maxAge == pug.getAge()) {
            System.out.println("Name is: " + pug.getName() + " and" + " Breed is: " + pug.getBreed());
        }
    else if (maxAge == dalmatian.getAge()) {
        System.out.println("Name is: " + dalmatian.getName() + " and" + " Breed is: " + dalmatian.getBreed());
        }
    else if (maxAge == french_bulldog.getAge()){
            System.out.println("Name is: " + french_bulldog.getName() + " and" + " Breed is: " + french_bulldog.getBreed());
        }
    }
}

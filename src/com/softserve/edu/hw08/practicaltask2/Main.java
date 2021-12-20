package com.software.edu.hw08.practicaltask2;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Student("David",15,"student"),
                new Teacher("Mark",5700,"Teacher"),
                new Cleaner("Sopha",3600,"Cleaner")};

        for(Person person:people){
            person.print();
            if (person instanceof Staff){
                ((Staff)person).salary();
            }
        }
    }
}

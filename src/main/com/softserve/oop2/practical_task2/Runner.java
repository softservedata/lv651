package com.softserve.oop2.practical_task2;

public class Runner {

    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Student("Bob", 20, "Student"),
                new Cleaner("Frank", 450, "Cleaner"),
                new Teacher("Stasy", 480, "Teacher")};

        for (Person person : people) {
            person.print();
            if (person instanceof Staff) {
                ((Staff) person).salary();
            }
        }

    }
}

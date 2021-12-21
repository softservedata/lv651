package com.lect8.inner.homework.one;

public class Appl {
    public static void main(String[] args) {
        FullName student1 = new Student(new Person() {
            @Override
            public String activity() {
                return "Du hast";
            }
        }, 1);
        student1.setLastName("Ivanow");
        student1.setFirstName("Aleks");
        ((Person) student1).setAge(22);
        student1.toString();
        FullName student2 = new Student(new Person() {
            @Override
            public String activity() {
                return null;
            }
        }, 3);
        student2.setLastName("Iva");
        student2.setFirstName("Jepira");
        ((Person) student2).setAge(24);
        student1.toString();

        System.out.println(((Person) student1).info());
        System.out.println(((Person) student1).activity());
        System.out.println(((Person) student2).info());
        System.out.println(((Person) student2).activity());
    }
}

package com.lect7.oop2.practicaltask.task1;

public class Appl {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {new Cat("Asker", 7), new Dog("Biba", 9),
                                         new Dog("Vava", 4), new Cat("Busya", 5)};
        Animal anim = null;
        for (Animal ani : animals){
            ani.feed();
            ani.voice();
            anim = ani;
        }
        System.out.println(anim);
    }
}

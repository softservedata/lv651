package com.software.edu.hw08.practicaltask1;

public class Main {
    public static void main(String[] args) {
        Cat animal1 = new Cat("Barsic",3);
        Cat animal2 = new Cat("Kot",2);
        Cat animal3 = new Cat("Semen",10);

        Dog animal4 = new Dog("Bars",1);
        Dog animal5 = new Dog("Chip",6);
        Dog animal6 = new Dog("Dora",3);
        Animal[] animals = new Animal[] {animal1,animal2,animal3,animal4,animal5,animal6};

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }
}

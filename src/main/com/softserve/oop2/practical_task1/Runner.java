package com.softserve.oop2.practical_task1;

public class Runner {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Fibby", 3);
        Dog dog2 = new Dog("Claire", 6);
        Cat cat1 = new Cat("Rosa", 2);
        Cat cat2 = new Cat("Kola", 4);
        Animal[] animals = new Animal[]{dog1, cat1, dog2, cat2};

        for (Animal animal : animals) {
            animal.voice();
            animal.feed();
        }
    }

}

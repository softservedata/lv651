package com.softserve.edu.homework3;

public class Dog {
    String name;
    Breed breed;
    int age;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public Breed getBreed() {
        return breed;
    }
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dog dog = (Dog) o;

        if (age != dog.age) return false;
        if (!name.equals(dog.name)) return false;
        return breed.equals(dog.breed);
    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + breed.hashCode();
        result = 31 * result + age;
        return result;
    }
    public static void main(String[] args) {
        Dog Archie = new Dog("Archie", Breed.Field,5);
        Dog Argos = new Dog("Argos", Breed.Labrador, 2);
        Dog Elvis = new Dog("Elvis", Breed.Rottweiler,8);

        System.out.println(Archie.equals(Argos));
        System.out.println(Archie.equals(Elvis));

        System.out.println(Math.max(Math.max(Archie.age, Argos.age), Elvis.age));
    }
}

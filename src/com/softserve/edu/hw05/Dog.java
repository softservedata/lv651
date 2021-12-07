package com.softserve.edu.hw05;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog() {
    }

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public enum breeds
    {
        Labrador,Rotvailer,Haski;
    }
    public static void main(String args [])
    {
        Dog dog1 = new Dog("Eger", 8,"Labrador");
        Dog dog2 = new Dog("Rose", 3,"Rotvailer");
        Dog dog3 = new Dog("Balto", 9,"Haski");
        if(dog1.getName() == dog2.getName())
            System.out.println("Dog 1 have the same name as dog 2." + "(" + dog1.getName() + ")");
        if(dog2.getName() == dog3.getName())
            System.out.println("Dog 2 have the same name as dog 3." + "(" + dog2.getName() + ")");
        if(dog1.getName() == dog3.getName())
            System.out.println("Dog 1 have the same name as dog 3." + "(" + dog3.getName() + ")");
        if(dog1.getName() == dog3.getName() && dog2.getName() == dog3.getName())
            System.out.println("All dogs have same names." + "(" + dog1.getName() +")");


        int max = 0;
        int min = 0;
        if(dog1.getAge() > dog2.getAge() && dog1.getAge() > dog3.getAge()) {
            max = dog1.getAge();
            System.out.println("The oldest dog is " + dog1.getName() + " and his breed - " + dog1.getBreed());
        }
        if (dog2.getAge() > dog3.getAge() && dog2.getAge() > dog1.getAge()) {
            max = dog2.getAge();
            System.out.println("The oldest dog is " + dog2.getName() + " and his breed - " + dog2.getName());
        }
        if (dog3.getAge() > dog1.getAge() && dog3.getAge() > dog2.getAge()) {
            max = dog3.getAge();
            System.out.println("The oldest dog is " + dog3.getName() + " and his breed - " + dog3.getBreed());
        }
    }


}

package HW07.PracticalTask;

import HW04.HomeTasks.Breed;

public class PT_1 {
    /*
    Create interface Animal with methods voice() and feed().
    Create two classes Cat and Dog, which implement this interface.
    Create array of Animal and add some Cats and Dogs to it.
    Call voice() and feed() method for all of it
     */
    public static void main(String[] args) {
        Animal[] zoo = {
                new Cat("Murzic",CatBreed.Persian, 2),
                new Cat("Maxic",CatBreed.Persian, 5),
                new Dog("Rex",Breed.COLLIE, 6),
                new Dog("Reina",Breed.COLLIE, 7)
        };

        getVoiceHaveFeed(zoo);

    }

    private static void getVoiceHaveFeed(Animal[] zoo) {
        for (Animal animal : zoo) {
            animal.voice();
            animal.feed();
            System.out.println();
        }
    }
}

class Dog implements Animal{
    private String name;
    private Breed breed;

    public Dog(String name, Breed breed, int age) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }

    @Override
    public void voice() {
        //System.out.println("Dogs say Wof-Wof!");
        System.out.println(getName() + " say Wof-Wof!");
    }

    @Override
    public void feed() {
        //System.out.println("Dogs like meet");
        System.out.println(getName() + " have a meet.");
    }
}

class Cat implements Animal{
    private String name;
    private CatBreed breed;

    public Cat(String name, CatBreed breed, int age) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public CatBreed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed=" + breed +
                '}';
    }

    @Override
    public void voice() {
        System.out.println(getName() + " say Miu-Miu!");
    }

    @Override
    public void feed() {
        //System.out.println("Cats like milk");
        System.out.println(getName() + " have a milk.");
    }
}

interface Animal{
    public void voice();
    public void feed();
}

enum CatBreed{
    Persian,
    Siamese,
    Sphynx
}
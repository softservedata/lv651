package homework.hw04.tasks;

public class Dog {
    private String name;
    private Breed breed;
    private int age;

    public Dog() {
        this.name = "";
        this.breed = Breed.STANDART;
        this.age = 0;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name
                + ", breed=" + breed
                + ", age=" + age
                + "]";
    }
}

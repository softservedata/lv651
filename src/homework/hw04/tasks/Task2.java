package homework.hw04.tasks;

public class Task2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buggy", Breed.BULLDOG, 15);
        Dog dog2 = new Dog("Buggy", Breed.AKBASH, 10);
        Dog dog3 = new Dog("Luffy", Breed.AKBASH, 14);
        Dog dogTemp = new Dog();

        if (dog1.getName().equals(dog2.getName()) || dog1.getName().equals(dog3.getName()) || dog2.getName().equals(dog3.getName())) {
            System.out.println("There is dogs with the same name");
        } else {
            System.out.println("There is no dogs with the same name");
        }

        if (dog1.getAge() > dog2.getAge()) {
            dogTemp = dog1;
        } else {
            dogTemp = dog2;
        }
        if (dogTemp.getAge() > dog3.getAge()) {
            System.out.println("The oldest dog is " + dogTemp.getName() + "(" + dogTemp.getBreed() +").");
        } else {
            System.out.println("The oldest dog is " + dog3.getName() + "(" + dog3.getBreed() +").");
        }
    }
}

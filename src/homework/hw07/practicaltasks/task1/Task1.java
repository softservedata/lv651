package homework.hw07.practicaltasks.task1;

public class Task1 {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Cat1"),
                new Cat("Cat2"),
                new Dog("Dog1"),
                new Dog("Dog2")
        };
        for (Animal animal : animals) {
            System.out.println(animal + "\n\t" + animal.feed() + "\n\t" + animal.voice());
        }
    }
}

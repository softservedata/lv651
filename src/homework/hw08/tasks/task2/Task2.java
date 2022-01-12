package homework.hw08.tasks.task2;

public class Task2 {
    public static void main(String[] args) {

        Wrapper<Integer> obj1 = new Wrapper<>(15);
        Wrapper<String> obj2 = new Wrapper<>("Some text");
        Wrapper<Boolean> obj3 = new Wrapper<>(true);

        System.out.println("Wrapper<Integer>: \n\tobj1.getValue: " + obj1.getValue());
        System.out.println("Wrapper<String>: \n\tobj2.getValue: " + obj2.getValue());
        System.out.println("Wrapper<Boolean>: \n\tobj3.getValue: " + obj3.getValue());

    }
}

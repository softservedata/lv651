package homework.hw08.practicaltasks.task2;

public class Task2 {
    public static void main(String[] args) {

        Wrapper<Square> squareWrapper = new Wrapper<>(new Square("SquareWrapped"));
        System.out.println(squareWrapper);

        Wrapper<Circle> circleWrapper = new Wrapper<>(new Circle("CircleWrapped"));
        System.out.println(circleWrapper);

        // Wrapper<String> stringWrapper = new Wrapper<>(new String("StringWrapped")); Wrapper wrap objects which implements Shape

    }
}

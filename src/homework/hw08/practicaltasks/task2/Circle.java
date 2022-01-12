package homework.hw08.practicaltasks.task2;

public class Circle implements Shape{

    private String figureName;

    public Circle(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String toString() {
        return "Circle{figureName = " + figureName + "}";
    }
}

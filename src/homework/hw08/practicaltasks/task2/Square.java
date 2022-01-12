package homework.hw08.practicaltasks.task2;

public class Square implements Shape{

    private String figureName;

    public Square(String figureName) {
        this.figureName = figureName;
    }

    @Override
    public String toString() {
        return "Square{figureName = " + figureName + "}";
    }
}

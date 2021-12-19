package HW08.PracticalTask.PT2;

public class PT2 {
    public static void main(String[] args) {
        Wrapper<Shape> squareWrapper = new Wrapper<>(new Square());
        Wrapper<Circle> circleWrapper = new Wrapper<>(new Circle());
        //Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        squareWrapper.drawShape();
        circleWrapper.drawShape();
    }
}

package HW08.PracticalTask.PT2;

public class Wrapper<T> implements Shape{
    private Shape shape;

    public Wrapper(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void drawShape() {
        System.out.print("ShapeWrapper:");
        shape.drawShape();
    }
}

package homework.hw06.practicaltasks.task2;

public class ColorLine extends Line{
    private String color;

    public ColorLine() {
        this.color = "";
    }

    public ColorLine(String color) {
        this.color = color;
    }

    public ColorLine(Point pt1, Point pt2, String color) {
        super(pt1, pt2);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "Color = " + color +
                " point 1 =" + super.getPt1() +
                ", point 2 =" + super.getPt2() +
                "}";
    }
}

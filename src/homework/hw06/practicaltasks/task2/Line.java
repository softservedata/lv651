package homework.hw06.practicaltasks.task2;

public class Line {
    private Point pt1;
    private Point pt2;

    public Line(){
        this.pt1 = new Point();
        this.pt2 = new Point();
    }

    public Line(Point pt1, Point pt2) {
        this.pt1 = pt1;
        this.pt2 = pt2;
    }

    public Point getPt1() {
        return pt1;
    }

    public void setPt1(Point pt1) {
        this.pt1 = pt1;
    }

    public Point getPt2() {
        return pt2;
    }

    public void setPt2(Point pt2) {
        this.pt2 = pt2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "point 1 =" + pt1 +
                ", point 2 =" + pt2 +
                '}';
    }
}

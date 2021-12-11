package HW06.PracticalTask;

import java.util.Arrays;

public class PT_2 {
    /*
    2. Create three classes:
    Point with attributes x and y
    Line which contains two object of Point class
    ColorLine with attributes Color  which extends Line class.
    Override method toString() and define method print() in every classes
    In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.
    */
    public static void main(String[] args) {
        Point a = new Point("A", 0, 0);               //  B ------------------------ C
        Point b = new Point("B", 0, 4);               //   |                        |
        Point c = new Point("B", 4, 4);               //   |                        |
        Point d = new Point("C", 4, 0);               //   |                        |
        Line ab = new Line(a, b);                                 //  A|________________________ D
        Line bc = new Line(b, c);
        Line cd = new Line(c, d);
        Line da = new Line(d, a);
        ColorLine ac = new ColorLine(a, c, Color.RED);
        Line[] paint = {ab,bc,cd,da,ac, new ColorLine(b,d,Color.BLUE)};
        //System.out.println(Arrays.toString(paint));
        PrintPaint(paint);
    }

    private static void PrintPaint(Line[] paint) {
        for (Line l: paint) {
            System.out.println(l.print());
        }
    }
}

class Point {
    String name;
    int x;
    int y;

    public Point(int x, int y) {
        this.name = "";
        this.x = x;
        this.y = y;
    }

    public Point(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    //@Override
    /*public String toString() {
        return "(" +
                "x=" + x +
                ", y=" + y +
                ')';
    }*/

    public String print() {
        return "" + x +
                ", " + y ;
    }
    @Override
    public String toString() {
        return name + "(" +
                +  x +
                ", " + y +
                ')';
    }
}

class Line {
    Point p1;
    Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "Line{" +
                "p1(" + p1 +
                ", p2" + p2 + ")" +
                '}';
    }

    public String print() {
        return  p1.getName() +
                p2.getName() +
                "(" + p1.print() +
                " : " + p2.print() + ")";
    }
}

class ColorLine extends Line {
    Color color;

    public ColorLine(Point p1, Point p2, Color color) {
        super(p1, p2);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "p1" + p1 +
                ", p2" + p2 +
                ", color=" + color +
                '}';
    }

    @Override
    public String print() {
        return super.print()+ "(color: " + color +")";
    }
}

enum Color {
    RED,
    GREEN,
    BLUE;

}
package homework.hw06.practicaltasks.task2;

import homework.hw06.practicaltasks.task1.Car;

public class Task2 {
    public static void main(String[] args) {
        ColorLine ln1 = new ColorLine(new Point(21,13), new Point(22, 54), "red");
        ColorLine ln2 = new ColorLine(new Point(44,11), new Point(90, 65), "red");
        ColorLine ln3 = new ColorLine(new Point(24,53), new Point(46, 34), "red");
        Line ln4 = new Line(new Point(57,17), new Point(45, 45));
        Line ln5 = new Line(new Point(12,9), new Point(33, 86));
        Line[] lines = {ln1, ln2, ln3, ln4, ln5};

        for (Line line : lines) {
            System.out.println(line + "\n");
        }
    }
}

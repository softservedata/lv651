package com.softserve.oop1.practicaltask2;

public class Runner {
    public static void main(String[] args) {
        Line line1 = new Line();

        Line[] lineArr = new Line[] {line1, new Line(), new Line(), new ColorLine(), new ColorLine()};
        //Usual iteration in array
        for (Line line : lineArr) {
            line.print();
        }

//        for(Line color : lineArr) {
//            color.print();
//        }

    }
}

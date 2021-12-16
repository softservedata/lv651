package com.software.edu.hw07.practicaltask2;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line();
        Line[] arrayLine = new Line[]{line1, new Line(), new Line(), new ColorLine(), new ColorLine()};

        for (Line line : arrayLine) {
            line.print();
        }
    }
}

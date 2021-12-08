package com.lection6.oop1.practicalTasks.numb2;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Line [] line = new Line[]{new Line(), new Line(),new ColorLine(),new Line()};

        for (Line line1 : line){
            line1.print();
        }

        System.out.println(Arrays.toString(line));
    }
}

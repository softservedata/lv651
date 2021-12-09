package com.softserve.oop1.practicaltask2;

public class ColorLine extends Line {
    private Colors colors;

    public enum Colors {
        BLUE,
        GREEN,
        PINK,
        YELLOW;
    }

    @Override
    public String toString() {
        return "The colors are: "
                + Colors.BLUE + ", "
                + Colors.GREEN + ", "
                + Colors.PINK + ", "
                + Colors.YELLOW
                + '}';
    }

    public void print() {
        System.out.println("Colorlines: " + toString());
    }
}

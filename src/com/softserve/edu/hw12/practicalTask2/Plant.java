package com.software.edu.hw12.practicalTask2;

public class Plant {
    private int size;
    private Main.Color color;
    private Main.Type type;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Main.Color c = colorStrToEnum(color);
        Main.Type t = typeStrToEnum(type);
        this.size = size;
        this.color = c;
        this.type = t;
    }


    private Main.Type typeStrToEnum(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "herbs":
                return Main.Type.HERBS;
            case "shrubs":
                return Main.Type.SHRUBS;
            case "trees":
                return Main.Type.TREES;
            default:
                throw new TypeException("Input only herbs, shrubs and trees");

        }
    }


    private Main.Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "blue":
                return Main.Color.BLUE;
            case "red":
                return Main.Color.RED;
            case "white":
                return Main.Color.WHITE;
            case "green":
                return Main.Color.GREEN;
            case "yellow":
                return Main.Color.YELLOW;
            case "orange":
                return Main.Color.ORANGE;
            case "purple":
                return Main.Color.PURPLE;
            default:
                throw new ColorException("Input only color blue, red, white, green, yellow, orange, purple");

        }
    }

    @Override
    public String toString() {
        return "Plant[" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                ']';
    }
}
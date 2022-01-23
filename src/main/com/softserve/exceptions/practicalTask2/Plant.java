package com.softserve.exceptions.practicalTask2;

import java.util.Locale;

public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Type typeStrToEnum(String type) throws TypeException{
        switch (type.toLowerCase()){
            case "herbs":
                return Type.HERBS;
            case "shrubs":
                return Type.SHRUBS;
            case "trees":
                return Type.TREES;
            default:
                throw new TypeException("Input only herbs, shrubs and trees");
        }
    }

    private Color colorStrToEnum(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "pink":
                return Color.PINK;
            case "yellow":
                return Color.YELLOW;
            case "green":
                return Color.GREEN;
            default:
                throw new ColorException("Input only color blue, red or white");
        }
    }

    @Override
    public String toString() {
        return "Plant type: " + type + ", color: " + color + ", size: " + size + ".";
    }
}






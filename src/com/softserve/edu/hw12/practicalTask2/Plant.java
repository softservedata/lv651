package com.software.edu.hw12.practicalTask2;

import java.util.ArrayList;
import java.util.List;

public class Plant {

    enum Color {
        RED, WHITE, GREEN, YELLOW, ORANGE, BLUE, PURPLE
    }

    enum Type {
        HERBS, SHRUBS, TREES

    }
    //public class Plant {
        private int size;
        private Color color;
        private Type type;

        public Plant(String type, String color, int size) throws ColorException, TypeException {
            Color c = colorStrToEnum(color);
            Type t = typeStrToEnum(type);
            this.size = size;
            this.color = c;
            this.type = t;
        }


        private Type typeStrToEnum(String type) throws TypeException {
            switch (type.toLowerCase()) {
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
                case "blue":
                    return Color.BLUE;
                case "red":
                    return Color.RED;
                case "white":
                    return Color.WHITE;
                case "green":
                    return Color.GREEN;
                case "yellow":
                    return Color.YELLOW;
                case "orange":
                    return Color.ORANGE;
                case "purple":
                    return Color.PURPLE;
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
    public static void main(String[] args) throws ColorException, TypeException {
        try{
            List<Plant> plants = new ArrayList<>();
            plants.add(new Plant("herbs", "black", 7));
            plants.add(new Plant("trees", "green", 120));
            plants.add(new Plant("shrubs", "red", 15));
            plants.add(new Plant("trees", "yellow", 300));
            plants.add(new Plant("threes","green",400));

            System.out.println(plants);
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() + "\n");
        }
    }

}

package homework.hw11.practicaltasks.task2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        try {
            Plant[] plants = {
                    new Plant(2, "Tree", "Red"),
                    new Plant(3, "Sky", "Blue"),
                    new Plant(5, "Flower", "Purple"),
                    new Plant(1, "Flower", "Green"),
                    new Plant(2, "Eggplant", "Purple")
            };
            System.out.println(Arrays.toString(plants));
        } catch (ColorException e) {
            System.out.println("ColorException: " + e.getMessage());
        } catch (TypeException e) {
            System.out.println("TypeException: " + e.getMessage());
        }


    }
}

package com.software.edu.hw12.practicalTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) throws ColorException, TypeException {
        try{
            res();
        }catch (ColorException | TypeException e){
            System.err.println(e.getMessage() + "\n");
        }
    }

    public static void res() throws ColorException, TypeException {
        List<Plant> plants = new ArrayList<>();
        plants.add(new Plant("herbs", "yellow", 7));
        plants.add(new Plant("shrubs", "red", 20));
        plants.add(new Plant("trees", "green", 120));
        plants.add(new Plant("trees", "yellow", 300));
        plants.add(new Plant("threes","green",300));

        System.out.println(plants);
    }
}

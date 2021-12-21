package com.softserve.edu.hw06.task1;

public class Application {
    public static void main(String[] args) {
        Penguin penguin = new Penguin(false, true);
        Eagle eagle = new Eagle(true,true);
        Swallow swallow = new Swallow(true,true);
        Chicken chicken = new Chicken(true, true);
        Bird[] birdArray = {penguin, swallow, eagle, chicken};

        for (Bird element : birdArray) {
            System.out.println(element);
            element.fly();
        }


    }

}

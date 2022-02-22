package com.softserve.edu.hwOOP1;

import java.util.ArrayList;
import java.util.List;

public class Appl3 {

	public static void main(String[] args) {
		List<Bird> birds = new ArrayList<>();
        birds.add(new Eagle());
        birds.add(new Swallow());
        birds.add(new Penguin());
        birds.add(new Chicken());
        for (Bird bird : birds) {
            System.out.println("I'm a " + bird.toString() + " and " + bird.fly());
        }
    }
}
package com.softserve.edu.hw06.task1;

import javax.sound.midi.Soundbank;

public class NonFlyingBird extends Bird {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }

    public NonFlyingBird(Boolean feathers, Boolean layEggs) {
        super(feathers, layEggs);
    }
}

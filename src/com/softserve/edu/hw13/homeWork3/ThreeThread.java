package com.software.edu.hw13.homeWork3;

public class ThreeThread implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");

        }
    }
}

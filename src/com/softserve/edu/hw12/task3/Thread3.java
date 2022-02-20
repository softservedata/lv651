package com.softserve.edu.hw12.task3;

public class Thread3 extends Thread {
    @Override
    public void run(){
        for(int i=0; i<5; i++)
            System.out.println("Thread number three");
    }

    }


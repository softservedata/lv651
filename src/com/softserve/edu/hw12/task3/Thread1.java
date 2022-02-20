package com.softserve.edu.hw12.task3;

public class Thread1 extends Thread{
    @Override
    public void run(){
        Thread threadTwo = new Thread2();
        threadTwo.start();
    }
}

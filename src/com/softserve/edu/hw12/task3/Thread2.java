package com.softserve.edu.hw12.task3;

public class Thread2 extends Thread{
    public void run(){
        for(int i=0; i<3; i++)
            System.out.println("Thread number two");
    }
}

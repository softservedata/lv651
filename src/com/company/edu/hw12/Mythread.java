package com.company.edu.hw12;

public class Mythread extends Thread{
   private int threadNumber;

    public Mythread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("This is thread #" + threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
}

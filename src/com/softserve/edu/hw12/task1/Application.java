package com.softserve.edu.hw12.task1;

public class Application {
        public static void main(String[] args) throws InterruptedException {
                Thread t1 = new MyThread();
                Thread t2 = new MyThread();
                Thread t3 = new MyThread();
                t1.start();
                t1.join();
                t2.start();
                t2.join();
                t3.start();


        }


}

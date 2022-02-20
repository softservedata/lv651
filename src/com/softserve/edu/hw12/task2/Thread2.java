package com.softserve.edu.hw12.task2;


import static com.softserve.edu.hw12.task2.Thread1.lock1;
import static com.softserve.edu.hw12.task2.Thread1.lock2;

class Thread2 extends java.lang.Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: Holding lock 1...");

                try { java.lang.Thread.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 1: Waiting for lock 2...");

                synchronized (lock2) {
                    System.out.println("Thread 1: Holding lock 1 & 2...");
                }
            }
        }
    }


package com.softserve.edu.hw12.task2;


     class Thread1 extends Thread2 {
         public static Object lock1 = new Object();
         public static Object lock2 = new Object();
        public void run() {
            synchronized (lock2) {
                System.out.println("Thread 2: Holding lock 2...");

                try { Thread2.sleep(10); }
                catch (InterruptedException e) {}
                System.out.println("Thread 2: Waiting for lock 1...");

                synchronized (lock1) {
                    System.out.println("Thread 2: Holding lock 1 & 2...");
                }
            }
        }
    }


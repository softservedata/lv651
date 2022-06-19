package com.company.edu.hw12;

public class Deadlock {
    public static void main(String[] args) {
        Object monitor1 = new Object();
        Object monitor2 = new Object();

        Thread t1 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");
            synchronized (monitor1) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (monitor2) {
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");

        }
                , "Thread1");
        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " start");

            synchronized (monitor2) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (monitor1) {
                }
            }
            System.out.println(Thread.currentThread().getName() + " end");
        }

                , "Thread2");
        t1.start();
        t2.start();
    }
    }


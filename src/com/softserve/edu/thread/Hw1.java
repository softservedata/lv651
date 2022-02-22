package com.softserve.edu.thread;

public class Hw1 {
	/*
	 * Run three threads and output there different messages for 5 times. The third
	 * thread supposed to start after finishing working of the two previous threads.
	 */

	public static void main(String[] args) {
	
		Runnable run1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("First thread");
            }
        };
        Thread thread1 = new Thread(run1);
        thread1.start();


        Runnable run2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Second thread");
            }
        };
        Thread thread2 = new Thread(run2);
        thread2.start();


        Runnable run3 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Third thread");
            }
        };
        Thread thread3 = new Thread(run3);
        thread3.setPriority(Thread.MIN_PRIORITY);
        thread3.start();


	}

}

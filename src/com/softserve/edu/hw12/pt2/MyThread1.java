
package com.softserve.edu.hw12.pt2;

public class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);


                System.out.println("«Hello, world»         " + Thread.currentThread().getId());
                //                   System.out.println("«Peace in the peace»");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

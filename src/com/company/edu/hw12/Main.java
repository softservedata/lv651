package com.company.edu.hw12;

public class Main{
    public static void main(String[] args) throws InterruptedException {
//Mythread thread1 = new Mythread(1);
//thread1.start();
//Mythread thread2 = new Mythread(2);
//thread2.start();
//thread2.join();
//Mythread thread3 = new Mythread(3);
//thread3.start();
 Thread t1 = new Thread(()->{
     Thread t2 = new Thread(()->{
         for(int i=0;i<3;i++){
             System.out.println("Thread number "+Thread.currentThread().getName());
         }
         Thread t3 = new Thread(()->{
             for(int i=0;i<5;i++){
                 System.out.println("Thread number "+Thread.currentThread().getName());
             }
         },"three");
     t3.start();
         },"two");
 t2.start();
     },"one");
 t1.start();
    }


}

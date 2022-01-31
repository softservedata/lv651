package com.software.edu.hw13.practicalTask2;


public class MyRunnable implements Runnable{
    @Override
    public void run(){
        for(int i =0; i<5;i++){
            System.out.println("Hello,World");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());

            }
            System.out.println("Peace in the space");
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

package com.softserve.edu.hw07;

public class Main {
    public static void main(String args []){
        Swallow bird = new Swallow("Brilliant", true);
        Penguin bird2 = new Penguin("Black", true);
        Eagle bird3 = new Eagle("Brown", true);
        Chicken bird4 = new Chicken("Orange", true);

        Bird [] birds = {bird,bird2,bird3,bird4};
        for (int i=0;i<4;i++) {
            System.out.println(birds[i]);
            System.out.println(birds[i].fly()); ;
        }

    }
}

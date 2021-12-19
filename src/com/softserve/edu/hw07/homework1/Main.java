package com.software.edu.hw07.homework1;

public class Main {
    public static void main(String[] args) {
        Swallow bird1 = new Swallow("Black",true);
        Penguin bird2 = new Penguin("Black",true);
        Chicken bird3 = new Chicken("White",true);
        Eagle bird4 = new Eagle("Brown",true);

        Bird[] birds = {bird1,bird2,bird3,bird4};

        for(int i =0; i<birds.length;i++){
            System.out.println(birds[i]+"\n"+birds[i].fly());
        }

        }

}


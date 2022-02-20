package com.softserve.edu.hw12.task3;

public class Application {
    public static void main(String[] args) {

            Thread threadOne = new Thread1();
            threadOne.start();

            Thread threadThree = new Thread3();
            threadThree.start();


        }


    }


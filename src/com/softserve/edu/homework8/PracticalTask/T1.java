package com.softserve.edu.homework8.PracticalTask;

import java.util.*;

public class T1 {
    public static void main(String[] args) {

        List<Integer> myCollection = new ArrayList<>();
            System.out.println("Enter 10 numbers: ");
            Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < 10; i++) {
                    myCollection.add(scanner.nextInt());
                }
            System.out.println(myCollection);

        List<Integer> newCollection = new ArrayList<>();
            for (int i = 0; i < myCollection.size(); i++) {
                if (myCollection.get(i) < 5) {
                    newCollection.add(myCollection.get(i));
                }
            }
        System.out.println(newCollection);

            myCollection.removeIf(x -> x > 20);
            System.out.println(myCollection);

            myCollection.add(2,1);
            myCollection.add(8,-3);
            myCollection.add(5,-4);

        System.out.println("position 2 – "  + myCollection.get(2));
        System.out.println("position 8 - " + myCollection.get(8));
        System.out.println("position 5 - " + myCollection.get(5));

        Collections.sort(myCollection);
        System.out.println(myCollection);





    }
}

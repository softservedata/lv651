package com.softserve.collections.practical_task1;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        List<Integer> myCollection = new ArrayList<>();
        List<Integer> newCollection = new ArrayList<>();

        System.out.println("Please enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            myCollection.add(sc.nextInt());
        }
        System.out.println("MyCollection numbers: " + myCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 5) {
                newCollection.add(myCollection.get(i));
            }
        }
        System.out.println("NewCollection with numbers over 5: " + newCollection);

        for (int i = 0; i < myCollection.size(); i++) {
            if (myCollection.get(i) > 20) {
                myCollection.remove(myCollection.get(i));
            }
        }
        System.out.println("myCollection list with removed numbers over 20: " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(5, -4);
        myCollection.add(8, -3);

        System.out.println("\nmyCollection position 2 the value of element is:" + myCollection.get(2));
        System.out.println("myCollection position 5 the value of element is:" + myCollection.get(5));
        System.out.println("myCollection position 8 the value of element is:" + myCollection.get(8));

        System.out.println("\nMyCollection numbers with added numbers: " + myCollection);

        Collections.sort(myCollection);
        System.out.println("Sorted myCollection: " + myCollection);

//        for(Integer sortedCollection : myCollection){
//            System.out.println(sortedCollection);
//        }
    }
}


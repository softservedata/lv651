package com.software.edu.hw10.practicalTask1;
import java.util.*;


public class MyCollection {
    public static void main(String[] args) {
        List<Integer> newLstInt = new ArrayList<Integer>();

        Integer[] arr = new Integer[10];
        for(int i = 0; i<10;i++){
            int x = (int) (Math.random()*40);
            arr[i] = x;
        }
        List<Integer> lstInt = new ArrayList<Integer>(Arrays.asList(arr));
        System.out.println("My Collection:  " + lstInt);

        for(int j = 0; j< lstInt.size(); j++){
            if(lstInt.get(j) > 5){
                newLstInt.add(lstInt.get(j));
            }
        }
        System.out.println("\nNew Collection: " + newLstInt);


        lstInt.clear();
        for (int i = 0; i < newLstInt.size(); i++){
            if(newLstInt.get(i) > 20){
                lstInt.add(newLstInt.get(i));
            }
        }

        System.out.println("\nChanged My Collection: "+lstInt);

        lstInt.add(2,1);
        lstInt.add(5,-4);
        lstInt.add(8,-3);

        System.out.println("\nlstInt position 2 the value of element is:" + lstInt.get(2));
        System.out.println("lstInt position 8 the value of element is:" + lstInt.get(8));
        System.out.println("lstInt position 5 the value of element is:" + lstInt.get(5));

        System.out.println("\nUpdated My Collection: "+ lstInt);

        Collections.sort(lstInt);
        System.out.println("\nSorted My Collection: "+ lstInt);

    }
}

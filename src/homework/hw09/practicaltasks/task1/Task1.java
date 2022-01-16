package homework.hw09.practicaltasks.task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Random rand = new Random();
        // Use one or more of the next Collections: List, ArrayList, LinkedList
        List<Integer> myCollection = new LinkedList<>();
        List<Integer> newCollection = new ArrayList<>();

        // fill list by random elements
        int a=0;
        while (a < 10) {
            myCollection.add(rand.nextInt(30));
            a++;
        }
        myCollection.add(0, 34);
        System.out.println("myCollection = " + myCollection);

        for (Integer value : myCollection)
            if (value > 5) {
                newCollection.add(value);
            }
        System.out.println("\nnewCollection = " + newCollection);

        // Remove from collection myCollection elements, which are greater than 20
        myCollection.removeIf(integer -> integer > 20);
        System.out.println("\nremoved some elements\nmyCollection = " + myCollection);

        myCollection.add(2, 1);
        myCollection.add(8, -3);
        myCollection.add(5, -4);
        System.out.println("\nadd some elements\nmyCollection :");
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("  position - " + i + ", value of element - " + myCollection.get(i));
        }

    }
}

package HW09.PracticalTask;

import java.util.*;

public class PT1 {
    /*
    Declare collection myCollection of 10 integers and fill it (from the console or random).
    Find and save in list newCollection all positions of element more than 5 in the collection. Print newCollection
    Remove from collection myCollection elements, which are greater then 20. Print result
    Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
    Sort and print collection
    */
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<Integer>();
        //initList_v1(myCollection);
        initList_v2(myCollection);
        System.out.println("Init myCollection     :" + myCollection);

        ArrayList<Integer> newCollection = copySomeElems(myCollection);
        System.out.println("Copy  all elem > 5    :" + newCollection);

        //dellElementsMoreThan(myCollection,20);
        myCollection.removeIf(x -> x > 20);             //!!!!!!! cool))) !!!!!!!
        System.out.println("Deleted all elem > 20 :" + myCollection);

        insertSomeElements(myCollection);
        System.out.println("Inserted some elem    :" + myCollection);
        printList(myCollection);

        Collections.sort(myCollection);
        System.out.println("Sorted   some elem    :" + myCollection);

    }

    private static void printList(ArrayList<Integer> myCollection) {
        for (int i = 0; i < myCollection.size(); i++) {
            System.out.println("Position " + i + ", value of element - " + myCollection.get(i));
        }
    }

    private static void insertSomeElements(ArrayList<Integer> myCollection) {
        int pos[] = {2, 8, 5};
        int elem[] = {1, -1, -4};
        for (int i = 0; i < pos.length; i++) {
            if (pos[i] <= myCollection.size()) myCollection.add(pos[i], elem[i]);
            else System.out.println("Position " + pos[i] + " is too large. " +
                    "Collection size is " + (myCollection.size() - 1) +
                    " Elem :" + elem[i] + " wasn't insert.");
        }
    }

    private static void dellElementsMoreThan(ArrayList<Integer> myCollection, int filter) {
        Iterator i = myCollection.iterator();
        while (i.hasNext()) {
            Integer x = (Integer) i.next();
            if (x > filter) {
                i.remove();
            }
        }
    }

    private static ArrayList<Integer> copySomeElems(ArrayList<Integer> myCollection) {
        ArrayList<Integer> newCollection = new ArrayList<>();
        for (Integer e : myCollection) {
            if (e > 5) newCollection.add(e);
        }
        return newCollection;
    }

    private static void initList_v1(ArrayList<Integer> myCollection) {
        final int MAX_NUMBER = 50;
        final int SIZE = 10;
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            myCollection.add(random.nextInt(MAX_NUMBER));
        }
    }

    private static void initList_v2(ArrayList<Integer> myCollection) {
        final int MAX_NUMBER = 50;
        final int SIZE = 10;
        Integer[] x = new Integer[SIZE];
        Random random = new Random();
        Arrays.setAll(x, (index) -> random.nextInt(MAX_NUMBER));        //!!!!!!! cool))) !!!!!!!
        myCollection.addAll(Arrays.asList(x));
    }
}

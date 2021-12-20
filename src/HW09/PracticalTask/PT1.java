package HW09.PracticalTask;

import java.util.ArrayList;
import java.util.Random;

public class PT1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int MAX_NUMBER = 50;
        ArrayList<Integer> myCollection = new ArrayList<Integer>(SIZE);
        ArrayList<Integer> newCollection = new ArrayList<Integer>();
        Random random = new Random();

        for (int i = 0; i < SIZE; i++) {
            myCollection.add(random.nextInt(MAX_NUMBER));
        }
        System.out.println(myCollection);

        for (Integer e : myCollection) {
            if (e > 5) newCollection.add(e);
        }

        System.out.println(newCollection);

        myCollection.removeIf(x -> x > 20); //!!!!!!!!!!!!!!
        //myCollection.removeIf(20::equals);
        System.out.println(myCollection);
    }
}

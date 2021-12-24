package HW09.HomeWork;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HW1 {
    /*
    Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2),
    realizing the operations of union and intersection of two sets.
    Test the operation of these techniques on two pre-filled sets.
    */
    public static void main(String[] args) {

//        Set<String> set1 = new HashSet<>(Arrays.asList("A", "B", "C", "D", "E"));
//        Set<String> set2 = new HashSet<>(Arrays.asList("D", "E", "F", "G", "H"));
        Set<Integer> set1 = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5, 6));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9, 0));
        System.out.println("set1                 : " + set1);
        System.out.println("set2                 : " + set2);

        System.out.println("union     set1 & set2: " + union(set1, set2));
        System.out.println("intersect set1 & set2: " + intersect(set1, set2));
    }

    private static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }

    private static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }
}

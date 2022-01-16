package homework.hw09.tasks.task1;

import java.util.HashSet;
import java.util.Set;

public class Task1 {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> set = new HashSet<>(set1);
        set.retainAll(set2);
        return set;
    }

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("111"); set1.add("222");
        set2.add("333"); set2.add("222");

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);

        System.out.println("\nunion(set1, set2) = " + union(set1, set2));
        System.out.println("intersect(set1, set2) = " + intersect(set1, set2));

    }
}

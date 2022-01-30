package homework.hw13.practicaltasks;

import java.time.LocalDate;
import java.util.*;

public class Appl {

    static LocalDate firstMonday(LocalDate date) {
        LocalDate date1 = date.withDayOfMonth(1);
        int day = date1.getDayOfWeek().getValue() - 1;
        if (day == 0) {
            date = date.withDayOfMonth(1);
        } else {
            date = date.withDayOfMonth(8 - day);
        }
        return date;
    }

    static void sortStringLIst(List<String> list) {
        list.sort(String::compareTo);
    }

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        LocalDate date = LocalDate.now();

        // Print n random numbers on console using Java 8
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        rand.ints().limit(n).forEach(System.out::println);

        // Print n random numbers on console using Java 8 in a sorted order
        System.out.println("\nSorted stream");
        rand.ints().limit(n).sorted().forEach(System.out::println);

        // Using Java 8 show the biggest number from n random numbers
        List<Integer> numbers = Arrays.asList(34, 31, 7, 23, 15, -2, 44, 21);
        System.out.print("\nShow the biggest number from: ");
        numbers.forEach(num -> System.out.print(num + " "));
        System.out.print("\nThe biggest number is: " + numbers.stream().mapToInt(x -> x).max().getAsInt());

        // Show which today is a day of a week
        System.out.println("\n\nToday is " + date.getDayOfWeek());

        // Show a date of first Monday for current month
        System.out.println("\nDate of first Monday for current month: " + Appl.firstMonday(date).getDayOfMonth());

        // Write a method for sorting list of Strings using Java 8
        System.out.print("\nAppl.sortStringLIst(strings): ");
        List<String> strings = Arrays.asList("Abv", "sva", "asfb", "abc");
        Appl.sortStringLIst(strings);
        System.out.println(strings);

        sc.close();
    }
}

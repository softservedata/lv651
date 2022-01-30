package homework.hw13.tasks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Appl {

    static String encrypt(String s, int n) {
        StringBuilder encStr = new StringBuilder();
        s.chars()
                .map(ch -> (ch+n))
                .forEach(encStr::appendCodePoint);
        return encStr.toString();
    }

    static String decrypt(String s, int n) {
        StringBuilder encStr = new StringBuilder();
        s.chars()
                .map(ch -> (ch-n))
                .forEach(encStr::appendCodePoint);
        return encStr.toString();
    }

    //-----------------------------------------------------------------

    static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("MM.dd.yy"));
    }

    public static void main(String[] args) {

        /*
         * There is a list of strings list1. Create a new list list2 that has items from list1 and length less
         * than 5 characters (use method removeIf)
         */
        List<String> list1 = new ArrayList<>(Arrays.asList("abc", "Saturn", "Boom", "Yellow"));
        list1.removeIf(x -> x.length() < 5);
        List<String> list2 = list1;
        System.out.println("list2: " + list2);

        /* Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n
         * Method encrypt should take a string and return coded string where every letter is moved
         * on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should
         * return decoded value
         */
        System.out.println("\nencrypt(abc, 3): " + encrypt("abc", 3));
        System.out.println("decrypt(def, 3): " + decrypt("def", 3));

        // Create method to validate date according to format "mm.dd.yy"
        LocalDate today = LocalDate.now();
        System.out.println("\ndate according to format mm.dd.yy: " + formatDate(today));

    }
}

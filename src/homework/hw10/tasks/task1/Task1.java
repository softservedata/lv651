package homework.hw10.tasks.task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter sentence of five words: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.split(" ");

        String longestWord = "";
        if (words.length == 5) {
            for (String word : words) {
                if (word.length() > longestWord.length()) longestWord = word;
            }
            System.out.println("\n - display the longest word: " + longestWord);
            System.out.println(" - determine the number of it's letters: " + longestWord.length());
            System.out.println(" - bring the second word in reverse order: " + new StringBuilder(words[1]).reverse());
        } else {
            System.out.println("You need to enter the five words sentence");
        }
         scanner.close();
    }
}

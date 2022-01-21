package homework.hw10.tasks.task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence that contains the words between more than one space: ");
        String sentence = scanner.nextLine();
        System.out.println("Before editing: " + sentence);
        sentence = sentence.trim();
        sentence = sentence.replaceAll("\\s{2,}", " ");
        System.out.println("After editing: " + sentence);
        scanner.close();
    }
}

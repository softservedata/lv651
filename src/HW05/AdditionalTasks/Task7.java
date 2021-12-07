package HW05.AdditionalTasks;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        7.	Задано ціле число  k (від 1 до 180).
        Визначити, яка цифра знаходиться в k-ій позиції послідовності 10111213…9899,
        в якій виписані підряд всі двозначні числа;
        */
        String sequence="";
        for (int i = 10; i < 100; i++) {
            sequence = sequence + i;
        }
        System.out.println("We have sequence (len "+ sequence.length() +")");
        System.out.println(sequence);
        System.out.println("Enter position [1..180]:");
        Scanner scanner = new Scanner(System.in);
        int pos = Integer.parseInt(scanner.nextLine());
        System.out.println("number '" + sequence.charAt(pos-1) + "' is on the " + pos + " position.");
    }
}

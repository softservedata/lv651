package HW05.AdditionalTasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
        11.	Біля прилавка в магазині вишикувалась черга з  , покупців.
        Час обслуговування продавцем  -го покупця дорівнює
        Нехай задано натуральне  і дійсні числа  Отримати   де  - час перебування  -го покупця в черзі
        Вказати номер покупця, для обслуговування якого продавцю було потрібно найменше часу.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість покупців: ");
        int n = Integer.parseInt(scanner.nextLine()); //Кількість покупців
        int[] t = new int[n];                    //час обслуговування покупців
        int[] tWaiting = new int[n];

        generateServiceTime(t);
        countWaitingTime(t, tWaiting);
        int numMinServiceTme = getNumMinST(t);

        System.out.println("Час обслуговування клієнтів у черзі (у хв)");
        System.out.println(Arrays.toString(t));
        System.out.println("Час очікування клієнтів у черзі (у хв)");
        System.out.println(Arrays.toString(tWaiting));
        System.out.print("Найменьший час очікування складає " + t[numMinServiceTme] + " хв. у клієнта № " + (numMinServiceTme + 1));

        scanner.close();
    }

    //Find customer number who spend the less time in queue
    private static int getNumMinST(int[] t) {
        int minTime = Integer.MAX_VALUE;
        int indexMinTime = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] < minTime) {
                minTime = t[i];
                indexMinTime = i;
            }
        }
        return indexMinTime;
    }


    private static void generateServiceTime(int[] t) {
        Random rand = new Random();
        for (int i = 0; i < t.length; i++) {
            t[i] = rand.nextInt(19) + 1;     //час обслуговування покупця від 1-20 хв.
        }
    }

    private static void countWaitingTime(int[] t, int[] tWaiting) {
        tWaiting[0] = t[0];
        for (int i = 1; i < t.length; i++) {
            tWaiting[i] = tWaiting[i - 1] + t[i];
        }
    }
}

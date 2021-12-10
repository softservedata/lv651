package HW05.AdditionalTasks;

import java.util.Arrays;
import java.util.Random;

public class Task12 {
    public static void main(String[] args) {
        /*
        12.	В деяких видах спортивних змагань виступ кожного спортсмена  незалежно оцінюється кількома суддями,
        пізніше з всієї сукупності оцінок вилучається найвища і найнижча, а для решти оцінок обчислюється
        середнє арифметичне, яке іде в залік спортсмену. Якщо найвищу оцінку поставило декілька суддів,
        то з сукупності оцінок вилучається тільки одна така оцінка;
        аналогічно діють з найнижчими оцінками. Задано натуральне число  , дійсні додатні числа
        Вважаючи, що числа  - це оцінки, виставлені суддями одному з учасників змагань, визначити оцінку,
        яка піде в залік цьому спортсмену.
        */
        final int REFEREE_COUNT = 10;  //min 3
        final int MAX_MARK = 10;
        int[] marks = new int[REFEREE_COUNT];
        Random rand = new Random();
        for (int i = 0; i < REFEREE_COUNT; i++) {
            marks[i] = rand.nextInt(MAX_MARK);
        }
        System.out.println("You've got marks : " + Arrays.toString(marks));
        System.out.println("Your average mark is: " + getAverageMark(marks));
        Arrays.sort(marks);


    }

    private static double getAverageMark(int[] marks) {
        Arrays.sort(marks);
        double sum = 0;
        for (int i = 1; i < marks.length - 1; i++) {
            sum = sum + marks[i];
        }
        return sum / (marks.length - 2);
    }
}

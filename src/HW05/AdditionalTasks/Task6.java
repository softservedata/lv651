package HW05.AdditionalTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        6.	Відомо, що із чотирьох введених чисел a1, a2, a3 і a4 ,
        одне відрізняється від трьох інших, рівних між собою;
        присвоїти номер цього числа змінній n та вивести на екран
        */
        int[] n = new int[4];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 4 числа одне з яких відрізняється від трьох інших, рівних між собою");
        for (int i = 0; i < n.length; i++) {
            System.out.print("Введи число " + (i + 1) + ":");
            n[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("числа :" + Arrays.toString(n));
        int maxN = getMax(n);
        int minN = getMin(n);
        int cntMax = countN(n, maxN);
        int cntMin = countN(n, minN);

        if ((cntMax == 1 && cntMin==3) || (cntMax ==3 && cntMin==1)){
            int posSingleN = cntMax < cntMin ? getPosition(n, maxN) : getPosition(n, minN);
            System.out.println(posSingleN+1);
        }
        else {
            System.out.println("Введено невірне співвідношення чисел.");
        }

    }

    private static int getPosition(int[] n, int numForCount) {
        int pos = 0;
        while (n[pos] != numForCount && pos < n.length) {
            pos++;
        }
        return pos;
    }

    private static int countN(int[] n, int numForCount) {
        int cnt = 0;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == numForCount) cnt++;
        }
        return cnt;
    }

    private static int getMin(int[] n) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n.length; i++) {
            min = Math.min(n[i], min);
        }
        return min;
    }

    private static int getMax(int[] n) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n.length; i++) {
            max = Math.max(n[i], max);
        }
        return max;
    }
}

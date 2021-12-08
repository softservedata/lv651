package com.Array.Loops.homework.FiveIntNumbers;

import java.util.Arrays;
import java.util.Scanner;

public class Entering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] yourNumbers = new int[5];
        int[] yourNumbers = new int[]{-1, 4, -6, 8, 2};
        boolean posSeen = false;
        for (int i = 0; i < yourNumbers.length; i++) {
            if (yourNumbers[i] > 0 && posSeen) {
                System.out.println("Here positive: " + yourNumbers[i]);
                break;
            } else if (yourNumbers[i] > 0) {
                posSeen = true;
            }

        }

//        for (int i = 0; i< yourNumbers.length;i++){
//            yourNumbers[i] = sc.nextInt();
//        }
        // Сортування
        //Розвернули масив, почали переглядати його з кінця на перед....
//
//      }
//
//     */
        System.out.println(Arrays.toString(yourNumbers));
        //Знайшли максимальне число в масиві....

//        int maximumNmb = yourNumbers[0];
//        int i = 0;
//        int pos = 0;
//        do {
//            if (yourNumbers[i]>maximumNmb){
//                maximumNmb = yourNumbers[i];
//                pos = i;
//            }
//            i++;
//        } while (i<yourNumbers.length);
//        System.out.println(Arrays.toString(yourNumbers));
//        System.out.println(maximumNmb);
    }
}

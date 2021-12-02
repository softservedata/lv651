package HW05.PracticalTask;

import java.util.Arrays;

public class PT_1 {
    public static void main(String[] args) {
        /*
        Create an array of ten integers. Display
            the biggest of these numbers;
            the sum of positive numbers in the array;
            the amount of negative numbers in the array.
        What values there are more: negative or positive?
        */
        int[] arr = {-1, 0, -1, 2, 3, 4, 5, 6, 7, 8};
        int max = arr[0];
        int sumPos = 0;
        int amountNegative = 0;
        for (int i : arr) {
            max = Math.max(max, i);
            sumPos = sumPos + (i > 0 ? i : 0);
            amountNegative = amountNegative + (i < 0 ? 1 : 0);
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("The biggest of these numbers is:" + max);
        System.out.println("The sum of positive numbers    :" + sumPos);
        System.out.println("The amount of negative numbers :" + amountNegative);
    }
}

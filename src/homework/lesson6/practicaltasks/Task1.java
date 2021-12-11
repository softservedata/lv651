package homework.lesson6.practicaltasks;

public class Task1 {

	public static void main(String[] args) {
		int[] integers = {10, 15, -20, 7, -8, -21, -41, 55, 9, 0};
		int count1 = 0, count2 = 0, max = integers[0], sum = 0;
		for	(int i = 0; i < integers.length; i++) {
			if (max < integers[i]) {
				max = integers[i];
			}
			if (integers[i] >= 0) {
				sum = sum + integers[i];
				count1++;
			} else {
				count2++;
			}
		}
		System.out.println("The biggest of these numbers: " + max);
		System.out.println("The sum of positive numbers int the array: " + sum);
		System.out.println("The amount of negative numbers in the array: " + count2);
		if (count1 > count2) {
			System.out.println("There is more positive values");
		} else {
			if (count2 > count1) {
				System.out.println("There is more negative values");
			} else {
				System.out.println("There is same amount of negative and positive values");
			}
		}
	}
}

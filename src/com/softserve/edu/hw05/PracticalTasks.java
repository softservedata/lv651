package com.softserve.edu.hw05;


/*Enter three numbers. Find out how many of them are odd.
Enter the number of the day of the week. Display the name in three languages.
Enter the name of the country. Print the name of the continent. (Declare enum with names of continents)
Create class Product with fields name, price and quantity.
Create four instances of type Product. 
Display the name and quantity of the most expensive item.
Display the name of the items, which has the biggest quantity.*/



import java.util.Scanner;

public class PracticalTasks {

	public static void main(String[] args) {

		int[] arr = new int[3];
		Scanner s = new Scanner(System.in);

		System.out.print("Enter 3 numbers: ");
		for (int i = 0; i < 3; i++)
			arr[i] = s.nextInt();

		int countEven = 0, countOdd = 0;
		for (int i = 0; i < 3; i++) {
			if (arr[i] % 2 == 0)
				countEven++;
			else
				countOdd++;
		}

		System.out.println("\nEven Number: " + countEven);
		System.out.println("Odd Number: " + countOdd);
	}

}
			
/*Scanner scan = new Scanner(System.in);

System.out.println("Input firstNumber: ");
int firstNumber = scan.nextInt();			
System.out.print("Input secondNumber: ");
int secondNumber = scan.nextInt();	
System.out.print("Input thirdNumber: ");
int thirdNumber = scan.nextInt();	*/		
				
/*if (firstNumber%2!=0 && secondNumber%2!=0 && thirdNumber%2!=0) {
	System.out.println("All three numbers are odd");
}else if ((firstNumber%2!=0 && secondNumber%2!=0 && thirdNumber%2==0)
		||(firstNumber%2==0 && secondNumber%2!=0 && thirdNumber%2!=0)||(firstNumber%2!=0 && secondNumber%2==0 && thirdNumber%2!=0)) {
	System.out.println("Two numbers are odd");
}else if (firstNumber%2!=0 && secondNumber%2!=0 && thirdNumber%2!=0) {
			System.out.print("One of numbers is odd");
}else if (firstNumber%2==0 && secondNumber%2==0 && thirdNumber%2==0) {
			System.out.println("All numbers are even");
	}else {
		System.out.println("Smth goes wrong");*/






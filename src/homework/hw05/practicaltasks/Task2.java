package homework.hw05.practicaltasks;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee emp1 = new Employee("Alex", 5, 5000);
		Employee emp2 = new Employee("Anton", 3, 4500);
		Employee emp3 = new Employee("Jeff", 1, 3000);
		Employee emp4 = new Employee("Nikita", 1, 2500);
		Employee emp5 = new Employee("Oleg", 5, 7000);
		Employee[] emp = {emp1, emp2, emp3, emp4, emp5};
		Employee tmp;
		
		for (int i = 0; i < emp.length - 1; i++) {
			for (int j = i + 1; j < emp.length; j++) {
				if (emp[i].getSalary() < emp[j].getSalary()) {
					tmp = emp[i];
					emp[i] = emp[j];
					emp[j] = tmp;
				}
			}
		}
		System.out.println("All workersk sorted by salary: ");
		for (int i = 0; i < emp.length; i++) {
			System.out.println("\t" + emp[i].toString());
		}

		System.out.println("Enter number of department: ");
		int x = sc.nextInt();
		System.out.println("Workers from " + x + " department:");
		for (int i = 0; i < emp.length; i++) {
			if (emp[i].getDnum() == x) {
				System.out.println("\t" + emp[i].toString());
			}
		}
	}
}

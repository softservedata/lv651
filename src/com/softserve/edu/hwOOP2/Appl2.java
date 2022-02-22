package com.softserve.edu.hwOOP2;

public class Appl2 {

	public static void main(String[] args) {

		Person person1 = new Student("Liza");
		Person person2 = new Student("Olya");
		Person person3 = new Teacher("Ivan Petrovych");
		Person person4 = new Teacher("Oksana Semeniv");
		Person person5 = new Cleaner("Maryana Vasylivna");
		Person person6 = new Cleaner("Pavlo Igorovych");

		Person[] persons = { person1, person2, person3, person4, person5, person6 };

		for (Person person : persons) {
			System.out.println(person);
			person.print();
			if (person instanceof Staff)
				((Staff) person).salary();
			System.out.println();
		}
	}
}

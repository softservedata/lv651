package com.softserve.edu.hw05;

public class DogMain {

	public static void main(String[] args) {

		Dog dog1 = new Dog("Lucky", "terrier", 1);
		Dog dog2 = new Dog("Princess", "akita", 5);
		Dog dog3 = new Dog("Lola", "bulldog", 3);

		if (!dog1.getName().equals(dog2.getName()) && (!dog1.getName().equals(dog3.getName()))
				&& (!dog3.getName().equals(dog2.getName()))) {
			System.out.println("All dogs have a different name");
		} else {
			System.out.println("Some dogs have the same name");

			Dog oldestDog = dog1;
			if (dog2.getAge() > oldestDog.getAge()) {
				oldestDog = dog2;
			}
			if (dog3.getAge() > oldestDog.getAge()) {
				oldestDog = dog3;
			}
			System.out.println("The oldest dog " + oldestDog.getBreed() + " " + oldestDog.getName() + " is "
					+ oldestDog.getAge() + " years old");

		}
	}
}

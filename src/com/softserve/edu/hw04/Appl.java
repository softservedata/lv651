package com.softserve.edu.hw04;

import com.softserve.edu.hw04.Dog.Breed;

public class Appl {
	public static void main(String[] args) {
		
		

		Dog d1 = new Dog ("Rex" , 5, Breed.HUSKIE);
		System.out.println(d1.id);
		
		Dog d2 = new Dog ("Rex" , 10, Breed.DACHSHUND);
		System.out.println(d2.id);
		Dog d3 = new Dog ("Oskar" , 2, Breed.CHIHUAHUA);
	
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());		
	

	if ((d1.equals(d2)) || (d2.equals(d3)) || (d3.equals(d1)))
			
		System.out.println("Two dogs with the same name!!!");
			
	else 
		System.out.println ("No two dogs with the same name"); 
	
	
	if ((d1.getAge()>d2.getAge()) && (d1.getAge()>d3.getAge()))
		System.out.println ("Oldest dog is " + d1.breed + " "+ d1.getName() ); 
	
	if ((d2.getAge()>d1.getAge()) && (d2.getAge()>d3.getAge()))
		System.out.println ("Oldest dog is " + d2.breed + " "+ d2.getName() );
	
	if ((d3.getAge()>d2.getAge()) && (d3.getAge()>d1.getAge()))
		System.out.println ("Oldest dog is " + d3.breed + " "+ d3.getName() ); 
	}


}

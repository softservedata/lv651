package com.softserve.edu.hw08.wrapper;

public class Apppl {

	
	public static void main(String[] args) {
		Wrapper<Integer> intWrapper = new Wrapper<Integer>(5);
		Wrapper<String> stringWrapper = new Wrapper<String>("String 5");
		Wrapper<Boolean> boolWrapper = new Wrapper<Boolean>(false);
		
		intWrapper.getValue();
		stringWrapper.getValue();
		boolWrapper.getValue();
		
		
	}

}

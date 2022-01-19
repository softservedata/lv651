package com.softserve.edu.hw08.wrapper;

public class Wrapper<T> {
	private T value;

	public Wrapper(T value) {
		this.value = value;
	}

	public void  getValue() {
		System.out.println(value); 
	}

	public void setValue(T value) {
		this.value = value;
	}

	

}

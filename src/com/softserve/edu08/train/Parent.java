package com.softserve.edu08.train;

import java.io.Serializable;

public class Parent { //implements Serializable {
	
	// protected int f() {
	// private final int f() {
	int f() {
		System.out.println("running f() from Parent");
		return 1;
	}

	public int useF() {
		return f();
	}
}

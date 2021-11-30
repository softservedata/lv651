package com.softserve.edu08.train2;

import com.softserve.edu08.train.Parent;

public class OOPSamples {
	public static void main(String... args) {
		//Parent child = new Child();
		Child child = new Child();
		System.out.println("child.useF(): " + child.useF());
		System.out.println("child.useF2(): " + child.useF2());
		System.out.println("child.f(): " + child.f());
	}
}

package com.softserve.edu10clon;

public class AppAB {
	public static void main(String[] args) throws CloneNotSupportedException {
		B b = new B();
		b.setI(123);
		b.setJ(234);
		b.addSb("abc");
		System.out.println("1. b = " + b);
		B b2 = (B) b.clone();
		b2.setI(1230);
		b2.setJ(2340);
		b2.addSb("qwerty");
		System.out.println("2. b = " + b);
		System.out.println("2. b2 = " + b2);
	}
}

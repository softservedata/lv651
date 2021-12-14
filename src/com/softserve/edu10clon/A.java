package com.softserve.edu10clon;

public class A {

	private int i;
	private StringBuilder sb = new StringBuilder();

	public void setI(int i) {
		this.i = i;
	}

	public void addSb(String s) {
		sb.append(s);
	}

	@Override
	public String toString() {
		return "A [i=" + i + ", sb=" + sb + "]";
	}

}

package com.softserve.edu10clon;

public class B extends A implements Cloneable {
	private int j;

	public void setJ(int j) {
		this.j = j;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		System.out.println("\nclone() from B");
		return super.clone();
	}

	@Override
	public String toString() {
		return "B [j=" + j + "]  " + super.toString();
	}

}

package com.softserve.edu.hwOOP1;

public class Line {

	Point first = new Point(5, 7);
	Point second = new Point(4, 10);

	public Line() {
		super();
	}

	public Line(Point first, Point second) {
		super();
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "Line [first=" + first + ", second=" + second + "]";
	}

	public void print() {
		System.out.println("The points are: " + toString());
	}

}

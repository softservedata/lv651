package com.softserve.edu.hw06.point;


import com.softserve.edu.hw06.point.ColorLine.Color;

public class Main {
	
	
	

	public static void main(String[] args) {
		Point p3 = new Point(-7, 3); 
		Point p4 = new Point(-6, 0);
		Point p5 = new Point(2, 3); 
		Point p6 = new Point(0, 0);
		
		Line l1 = new Line (new Point(2, 3), new Point(-1, -3));
	
		
		Line [] list = new Line [5];
		list [0] = new Line(new Point(-1, 3), new Point(7, -6) );
		list [1] = new Line (p3, p4);
		list [2] = new ColorLine(new Point(-10, 8), new Point(-4, -1), Color.BLUE);
		list [3] = new ColorLine(p5, p6, Color.YELLOW);
		list [4] = l1;
	
		
		print (list);
		
	}

	 static void print (Line[] list ) {
		for (Line k : list) 
		System.out.println(k);
	}
	

}

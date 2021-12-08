package com.softserve.edu.hw06.point;

public class ColorLine extends Line {
	public enum Color {
		RED, GREEN, BLUE, YELLOW  
	}

	
	Color color;
	public ColorLine ( Point p1, Point p2, Color color) {
		super(p1, p2);
		this.color = color;
		
	}
	
	@Override
	public String toString() {
		return "ColorLine	 [x0 = " + p1.getX() + "	y0 = " +p1.getY()+ "		x1 = " +p2.getX() + "		y1 = "+p2.getY() +"		"+color + "	]";
	}
	
	
}

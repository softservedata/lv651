package com.softserve.edu.hw06.point;

public class Line  {
	
	 Point p1;
	 Point p2;
	
	public Line ( Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public String toString() {
		return "Line		 [x0 = " + p1.getX() + "	y0 = " +p1.getY()+ "		x1 = " +p2.getX() + "		y1 = "+p2.getY() + "			]";
	}
	
//	public Point getCoord ( Point p) {
//		int x = p.getX();
//		int y = p.getY();
//		return (p.getX(), p.getY());
//	
//	}
}
package com.softserve.edu.hwOOP1;

public class ColorLine extends Line {
private String Color;

@Override
public String toString() {
	return "ColorLine [Color=" + Color + "]";
}

public void print() {
    System.out.println("The color is: " + toString());
}
}
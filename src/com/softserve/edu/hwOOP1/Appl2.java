package com.softserve.edu.hwOOP1;

import java.util.Arrays;


/*2. Create three classes: 
Point with attributes x and y
Line which contains two object of Point class
ColorLine with attributes Color  which extends Line class.
Override method toString() and define method print() in every classes
In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it. */



public class Appl2 {

	public static void main(String[] args) {
		
		
	    Line [] line = new Line[]{new Line(), new Line(),new ColorLine(),new ColorLine()};

        for (Line newline : line){
            newline.print();
        }

        System.out.println(Arrays.toString(line));
	}

}

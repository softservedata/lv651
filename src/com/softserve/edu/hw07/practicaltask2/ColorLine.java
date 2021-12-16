package com.software.edu.hw07.practicaltask2;

import java.awt.*;

public class ColorLine extends Line {
    private Colors colors;

    public enum Colors{
        RED, ORANGE,YELLOW,GREEN,BLUE,PURPLE;

    }


    @Override
    public String toString() {
        return
                "'" + Colors.RED + ',' +
                        Colors.ORANGE+','+Colors.YELLOW+','+
                        Colors.ORANGE+','+Colors.GREEN+','+
                        Colors.ORANGE+','+Colors.BLUE+','+
                        Colors.ORANGE+','+Colors.PURPLE+'\'' ;
    }
    public void print(){
        System.out.println("ColorLine is: "+ toString());
    }
}

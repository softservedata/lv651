package com.software.edu.hw07.practicaltask2;

public class Line {
    private Point p1 = new Point(10,-5) ;
    private Point p2 = new Point(-5,10);

    @Override
    public String toString() {
        return "Line{" +
                "p1.x" + p1.getX() +
                ", p1.y=" + p1.getY() +
                ", p2.x"+p2.getX()+
                ", p2.y"+p2.getY()+
                '}';
    }
    public void print(){
        System.out.println("the lines : "+toString());

    }
}

package com.softserve.edu.hw11.pt2;


import com.softserve.edu.hw09.student.Student;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

            List<Plant> list = new LinkedList<Plant>();
            Iterator<Plant> iterator = list.iterator();

            list.add(new Plant(2, ColorException.Color.RED, TypeException.Type.ROSE));
            list.add(new Plant(4, ColorException.Color.WHITE, null));
            list.add(new Plant(11, null, TypeException.Type.OAK));
            list.add(new Plant(1, ColorException.Color.GREEN, TypeException.Type.ROSE));
            list.add(new Plant(-5, ColorException.Color.RED, TypeException.Type.ROSE));

            System.out.println(list);

            for (int i =0; i < list.size(); i++)
             {
                 try {

                     if (list.get(i).getSize() < 0) {
                         throw new Exception("size value can't be negative..." + list.get(i).toString());
                     }
                 }
                 catch (Exception e) {
                     e.printStackTrace();
                 }

                 try {

                     if (list.get(i).getColorExc() == null || list.get(i).getColorExc() == null) {

                         throw new Exception("object fields can't be null " + list.get(i).toString());

                     }

                 }
                 catch (Exception e1) {
                     e1.printStackTrace();
                 }

            }

        }




    }


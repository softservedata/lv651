package com.softserve.edu.hw11.pt2;


import java.text.ParseException;

public class Main {

    public static void main(String[] args) {
      try {
          Plant plant1 = new Plant(-4, ColorException.Color.RED, TypeException.Type.ROSE);
          System.out.println(plant1);

          if (plant1.getSize() < 0) throw new Exception ("Size value can't be negative...");


          if (plant1.getColorExc() == null || plant1.getTypeExc() == null )
              throw new Exception("Object fields can't be null ");

      }

        catch ( Exception e) {
          e.printStackTrace();


      }


    }
}

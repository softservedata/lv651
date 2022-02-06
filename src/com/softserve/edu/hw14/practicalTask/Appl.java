package com.software.edu.hw14.practicalTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@FunctionalInterface
interface MyFunctional{
    double f(double x);
}

public class Appl {

    public List<Double> rndm(MyFunctional mf, int n){
        List<Double> dList = new ArrayList<Double>();
        double num = 0;
        for (int i = 0; i < n; i++) {
            dList.add( mf.f(n));

        }
        return dList;
    }

    public double SortedRndm(MyFunctional mf, int n){
        List<Double> dList = new ArrayList<Double>();
        double num = 0;
        double biggest = 0;
        for (int i = 0; i < n; i++) {
            dList.add(mf.f(n));
            Collections.sort(dList);
        }
        biggest = dList.get(0);


        System.out.println("Sorted random numbers: "+ dList);
        return biggest;
    }


    public static void main(String[] args) {
        Appl appl = new Appl();

        MyFunctional f1 =  x -> Math.random()*15;

        System.out.println("Random numbers: "+ appl.rndm(f1,5));
        System.out.println("The biggest number: : "+ appl.SortedRndm(f1,5));


    }
}

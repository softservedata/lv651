package com.softserve.edu.hw09.task1;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>(){{
            add("hello");
            add("goodbye");
            add("goodnight");
        }};

        Set<String> set2 = new HashSet<String>(){{
            add("winter");
            add("summer");
            add("spring");
        }};
        Set<String> set3 = new HashSet<String>(){{
            add("hello3");
            add("goodbye3");
            add("goodnight3");
        }};

        Set<String> set4 = new HashSet<String>(){{
            add("winter4");
            add("summer4");
            add("spring4");
            add("goodbye3");
        }};

        SetHelper setHelper = new SetHelper();
        System.out.println(setHelper.union(set1,set2));
        System.out.println(setHelper.intersect(set3,set4));





    }


}

        /*Set<String> set1 = Set.of("value1", "value2");*/



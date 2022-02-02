package com.softserve.edu.hw12.pt3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Appl {

    public static void findAndWrite(List<String> list) {

        System.out.println("\n");
        String pattern = "was";
        for (int i = 0; i < list.size(); i++) {
            String text = list.get(i);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(text);

            while (m.find())
                System.out.println(i + " lines:  " + list.get(i).replaceAll(pattern, pattern.toUpperCase()));
        }
    }

    public static void getLongestAndShortestLine(List<String> list) {
        String longestLine = list.get(0);
        String shortestLine = list.get(0);

        for (String max : list) {
            if (max.length() > longestLine.length())
                longestLine = max;
        }
        for (String min : list) {
            if (min.length() < shortestLine.length())
                shortestLine = min;
        }
        System.out.println("Longest line is:  " + longestLine + "  (" + longestLine.length() + " symbols )");
        System.out.println("Shortest line is:  " + shortestLine + "  (" + shortestLine.length() + " symbols )");
    }

    public  void main(String[] args) {
        List<String> mylist = new ArrayList<String>();
        String fileName = "C:/B/lv651/src/com/softserve/edu/hw12/pt3/mytext.txt";
        try {

            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String s = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName);

            while ((s = br.readLine()) != null) {
                mylist.add(s);
                System.out.println("Line " + ++count + " read:   " + s.length() + " symbols.");
            }
            System.out.println(mylist);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");


        } catch (IOException e) {
//            e.printStackTrace();
        }

        Appl appl = new Appl();
        appl.findAndWrite(mylist);


        getLongestAndShortestLine(mylist);
        findAndWrite(mylist);


    }
}

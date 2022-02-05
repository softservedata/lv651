package com.software.edu.hw13.practicalTask3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {

    public static  void findAndWrite(List<String> list) {
        System.out.println("\n");
        String pattern = "var";
        int qwe = 0;
        for (int i = 0; i < list.size(); i++) {
            String info = list.get(i);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(info);

            while (m.find()) {
                qwe++;
                System.out.println(i + " lines:  " + list.get(i).replaceAll(pattern, pattern.toUpperCase()));
            }

        }
        if (qwe == 0) {
            System.out.println("Unfortunately, your file don't consist of word «var»\n");
        }

    }



    public static void getLongestAndShortestLine(List<String> list){
        String getLongest = list.get(0);
        String getShorter = list.get(0);

        for (String max: list){
            if(max.length() > getLongest.length()){
                getLongest = max;
            }
        }
        for (String min: list){
            if(min.length() < getShorter.length()){
                getShorter = min;
            }
        }

        System.out.println("\nThe Longest line has "+getLongest.length()+" symbols: ");
        System.out.println(getLongest);

        System.out.println("\nThe Shorter line has "+getShorter.length()+" symbols: ");
        System.out.println(getShorter);


    }

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        String fileName = "C:/Users/User/IdeaProjects/lv651/src/com/softserve/edu/hw13/homeWork4/myFile.txt";
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String s = null;
            int count = 0 ;

            while ((s = br.readLine()) !=null){
                myList.add(s);
                count++;
                System.out.println("Line " + count + " read:   " + s.length() + " symbols.");
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found ");


        } catch (IOException e) {
//            e.printStackTrace();
        }

        getLongestAndShortestLine(myList);
        findAndWrite(myList);
    }

}

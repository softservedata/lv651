package com.software.edu.hw13.homeWork4;

import javax.xml.stream.FactoryConfigurationError;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();


        String fileName1 = "C:/Users/User/IdeaProjects/lv651/src/com/softserve/edu/hw13/homeWork4/file1.txt";
        String fileName2 = "C:/Users/User/IdeaProjects/lv651/src/com/softserve/edu/hw13/homeWork4/file2.txt";
        FileOutputStream OutFile;
        try{
            FileReader fr = new FileReader(fileName1);
            BufferedReader br = new BufferedReader(fr);
            FileWriter wr = new FileWriter(fileName2);

            String s = null;
            String info = null;
            int count = 0;

            while ((s= br.readLine())!=null){
                myList.add(s);
                count++;
                info = "Number of lines : "+ count+"\n";
            }


            String getLongest = myList.get(0);


            for (String max : myList) {
                if (max.length() > getLongest.length()) {
                    getLongest = max;
                }
            }
            System.out.println(getLongest);


            FileWriter writer = new FileWriter(fileName2);
            writer.write(info);
            writer.append("This is the longest line:\n");
            writer.append(getLongest);
            writer.append("\nName: Vladyslav\nBirthday:  27.09.2003");

            writer.flush();


        }catch (FactoryConfigurationError | FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        catch (IOException e) {
            System.out.println(e.getMessage());;
        }

    }
}


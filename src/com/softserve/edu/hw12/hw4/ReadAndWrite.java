/**
 * Create file1.txt file with a text about your career.
 * Read context from file into array of strings. Each array item contains one line from file.
 * Write in to the file2.txt
 * 1) number of lines in file1.txt
 * 2) the longest line in file1.txt.
 * 3) your name and birthday date.
  */

package com.softserve.edu.hw12.hw4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndWrite {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<String>();
        String fileIn   = "C:/B/lv651/src/com/softserve/edu/hw12/hw4/file1.txt";
        String fileOut  = "C:/B/lv651/src/com/softserve/edu/hw12/hw4/file2.txt";

        String s = null;
        int count = 0;

        System.out.println("Read data from file:     " + fileIn);

        try (BufferedReader br = new BufferedReader(new FileReader(fileIn));
             BufferedWriter bw  = new BufferedWriter(new FileWriter(fileOut))) {

            while ((s = br.readLine()) != null) {
                myList.add(s);
                ++count;
              }

            System.out.println("Write data in file:     " + fileOut);
            bw.write("Number of lines in file1.txt = " + count);

            String longestLine = myList.get(0);
            for (String max : myList) {
                if (max.length() > longestLine.length())
                    longestLine = max;
           }
            bw.write("\nLongest line is:  " + longestLine + "  (" + longestLine.length() + " symbols )");

//            String pattern = "Taras";
//            String pattern = "\\d{1,2}.\\d{2}.\\d{2,4}";
            String pattern = "^([A-Z]+\\s[A-Z]+\\s[A-Z]+)";

            for (int i = 0; i < myList.size(); i++) {
                String text = myList.get(i);
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(text);

                if (m.find()){

                    System.out.println(text.substring(m.start(), m.end()) );
                    bw.write("\nBirthday date: " + text.substring(m.start(), m.end()) );
                }

            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

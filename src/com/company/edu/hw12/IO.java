package com.company.edu.hw12;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class IO {
    public String longestLine(String[] lines){
        List<String> strings = Arrays.asList(lines);
        String longest = strings.stream().
                max(Comparator.comparingInt(String::length)).get();
        int max = longest.length();
        return longest;
    }

    public static void main(String[] args) {
        int count=0;
        IO a = new IO();
        String max;
        String[] arr;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("file1.txt"));
            List<String> linearr = new ArrayList<String>();
            String line;
            while((line= reader.readLine())!=null){
                linearr.add(line);
                count++;
            }
            arr=linearr.toArray(new String[0]);
            max=a.longestLine(arr);
            for( String str : arr){
                System.out.println(str);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"));
            writer.write("Number of lines:"+String.valueOf(count));
            writer.write("\nLongest line:"+max);
            writer.write("\nName:"+arr[0]+"\nBirthday date:"+arr[1]);
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

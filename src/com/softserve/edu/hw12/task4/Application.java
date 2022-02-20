package com.softserve.edu.hw12.task4;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Application {
    public static void main(String[] args) throws IOException {

        ArrayList<String> result = new ArrayList<>();
      File file = new File ("D:/myFile.txt");
      File file2 = new File ("D:/2.txt");
        try (Scanner s = new Scanner(new FileReader(file))) {
            while (s.hasNext()) {
                result.add(s.nextLine());
            }
            System.out.println(result);
        }
        FileWriter writer = new FileWriter(file2);
            writer.write(result.size() + System.lineSeparator());
        Collections.sort(result, Comparator.comparingInt(String::length));
        System.out.println(result);
        writer.write(result.get(result.size() - 1) + System.lineSeparator());
        writer.write("My name: Oksana " + " " + "My birthday date: 27 March");
        writer.close();


    }

}

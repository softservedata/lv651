package homework.hw12.practicaltasks.task3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        String fileName = "D:/git/lv651/src/homework/hw12/practicaltasks/task3/mytext.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            List<String> text = new ArrayList<>();
            List<String> lineWithVar = new ArrayList<>();
            String s;
            String longLine = "";
            String shortLine = "";
            System.out.println("Read data from file: " + fileName + "\n");
            while ((s = br.readLine()) != null) {
                System.out.println(s + "\t||number of symbols: " + s.length());
                text.add(s);
                if (s.length() > longLine.length()) longLine = s;
                if (s.length() < shortLine.length() || shortLine.length() == 0) shortLine = s;
                if (s.contains("var")) lineWithVar.add(s);
            }

            System.out.println("\nThe longest line:\n" + longLine);
            System.out.println("\nThe shortest line:\n" + shortLine);
            System.out.println("\nLines, which consist of word 'var':");
            if (lineWithVar.size() > 0) {
                for (String line : lineWithVar) System.out.println(line);
            } else {
                System.out.println("-");
            }

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }

    }
}

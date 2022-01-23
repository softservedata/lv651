package homework.hw12.tasks.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        String fileName1 = "D:/git/lv651/src/homework/hw12/tasks/task4/file1.txt";
        String fileName2 = "D:/git/lv651/src/homework/hw12/tasks/task4/file2.txt";

        String line;
        String longestLine = "";
        String name = "";
        String birthday = "";
        int counter = 0;

        Pattern pName = Pattern.compile("[a-zA-Z]+\\s[a-zA-Z]+"); // pattern for name
        Matcher mName;
        Pattern pBDay = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{4}"); // pattern for BirthDay
        Matcher mBDay;

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2));
            List<String> text = new ArrayList<>();

            System.out.println("Read data from file: " + fileName1 + "\n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                text.add(line);

                if (line.length() > longestLine.length()) longestLine = line; //finds the longest line

                // finds birthday
                mBDay = pBDay.matcher(line);
                if (mBDay.find()) {
                    birthday = line.substring(mBDay.start(), mBDay.end());
                }

                //finds name
                if (line.toLowerCase(Locale.ROOT).contains("name")) {
                    mName = pName.matcher(line);
                    if (mName.find()) {
                        name = line.substring(mName.start(), mName.end());
                    }
                }

                counter++; //counts the number of lines
            }

            System.out.println("Write data to file: " + fileName2);
            bw.write("Number of lines in file1.txt: " + counter + "\n");
            bw.write("The longest line in file1.txt: "+ longestLine + "\n");
            bw.write("Name: " + name + "\n");
            bw.write("Birth day: " + birthday + "\n");

            br.close();
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException" + e.getMessage());
        } catch (IOException e) {
            System.out.println("IOException" + e.getMessage());
        }
    }
}

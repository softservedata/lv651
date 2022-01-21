package homework.hw10.tasks.task3;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String text = scanner.nextLine();

        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        System.out.println("\nResult");
        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()).trim());
        }
    }
}

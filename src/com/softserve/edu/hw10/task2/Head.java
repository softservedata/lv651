package com.softserve.edu.hw10.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Head {
    public static void main(String[] args) {
        String pattern = "[a-zA-Z]+";
        String text = "I    am      learning     Java   Core";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        System.out.println(text);

        m.reset();
        while (m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + " ");
        }

    }
}

package com.software.edu.hw11.practicalTask3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile(("^[a-z0-9_-]{3,15}$"));
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please, enter 5 names,using Latin alphabet, numbers and underscores: ");
        String names = br.readLine();


        String pattern = "\\w+([a-z0-9_\\.-]{3,15}+)";
        Pattern ptrn = Pattern.compile(pattern);
        Matcher matcher = ptrn.matcher(names);


        for (int i = 0; i < names.length(); i++) {
            if (matcher.find()) {
                System.out.println("This name is valid: " + names.substring(matcher.start(), matcher.end()));
            }
            if (!matcher.find()) {
                System.out.println("Other names are not valid.");
                break;
            }
        }
        br.close();
    }
}

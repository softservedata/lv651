package com.softserve.edu.hw13.hw1;

import java.util.List;

public class AppString1 {

    public String encrypt(String s, int n) {
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            text +=  (char) (s.charAt(i) + n);
        }
        return text;
    }

    public String dencrypt(String s, int n) {
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            text = text + (char) (s.charAt(i) - n);
        }

        return text;
    }


    public static void main(String[] args) {

        AppString1 appString1 = new AppString1();

        String message = "I love java!";
        System.out.println("Input message:      " + message);
        System.out.println("Encrypt message:    " + appString1.encrypt(message, 3));
        System.out.println("Decrypt message:    " + appString1.dencrypt(appString1.encrypt(message, 3), 3));






    }
}

package com.softserve.edu.hw13.hw1;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Scanner;

class Something {
    public String encrypt(String s, int n) {
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            text += (char) (s.charAt(i) + n);
        }
        return text;
    }

    public String decrypt(String s, int n) {
        String text = "";
        for (int i = 0; i < s.length(); i++) {
            text += (char) (s.charAt(i) - n);
        }
        return text;
    }


    public static void main(String[] args){

        Something something = new Something();
//        String message = "ABC";
        Scanner sc = new Scanner(System.in);


        System.out.println("Please enter message: ");
        String message = sc.nextLine();
        System.out.println("Input message:      " + message);
        System.out.println("Please enter shift position: ");
        try {
            int shift = Integer.parseInt(sc.nextLine());


            Converter<String, String> encryptor = something::encrypt;
            String encrypted = encryptor.convert(message, shift);
            System.out.println("Encrypted message:  " + encrypted);
            message = encrypted;


            Converter<String, String> decryptor = something::decrypt;
            String decrypted = decryptor.convert(message, shift);
            System.out.println("Decrypted message:  " + decrypted);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");


            sc.close();
        }


    }
}


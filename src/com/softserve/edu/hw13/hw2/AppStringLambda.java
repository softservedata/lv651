package com.softserve.edu.hw13.hw2;

@FunctionalInterface
interface Enrypt {
    String change(String s, int n);
}

@FunctionalInterface
interface Decrypt {
    String change(String s, int n);
}

public class AppStringLambda {

    public static void main(String[] args) {
        String message = "рпв0лвСЧЯЯzsjhjghj  =- ";
        int shift = 4;

        Enrypt encrypt = (s, n) -> {
            String text = "";
            for (int i = 0; i < s.length(); i++) {
                text += (char) (s.charAt(i) + n);
            }
            return text;
        };

        Decrypt decrypt = (s, n) -> {
            String text = "";
            for (int i = 0; i < s.length(); i++) {
                text += (char) (s.charAt(i) - n);
            }
            return text;
        };

        System.out.println("Message:            " + message);
        System.out.println("Encrypted message:  " + encrypt.change(message, shift));
        message = encrypt.change(message, shift);
        System.out.println("Decrypted message:  " + decrypt.change(message, shift));

    }
}
